package com.bookish.screens.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.AlertDialog
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.bookish.R
import com.bookish.ui.elements.BasicToolbar
import com.bookish.ui.elements.DangerCardEditor
import com.bookish.ui.elements.DialogCancelButton
import com.bookish.ui.elements.DialogConfirmButton
import com.bookish.ui.elements.RegularCardEditor
import com.bookish.ui.theme.BookishTheme
import com.bookish.ui.theme.card
import com.bookish.utils.DefaultFullWidthSpacer

@ExperimentalMaterialApi
@Composable
fun SettingsScreen(
    restartApp: (String) -> Unit,
    openScreen: (String) -> Unit,
    viewModel: SettingsViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState(initial = SettingsUiState(false))

    SettingsScreenContent(
        uiState = uiState,
        onLoginClick = { viewModel.onLoginClick(openScreen) },
        onSignUpClick = { viewModel.onSignUpClick(openScreen) },
        onSignOutClick = { viewModel.onSignOutClick(restartApp) },
        onDeleteMyAccountClick = { viewModel.onDeleteMyAccountClick(restartApp) }
    )
}

@ExperimentalMaterialApi
@Composable
fun SettingsScreenContent(
    modifier: Modifier = Modifier,
    uiState: SettingsUiState,
    onLoginClick: () -> Unit,
    onSignUpClick: () -> Unit,
    onSignOutClick: () -> Unit,
    onDeleteMyAccountClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        BasicToolbar(title = R.string.settings)

       DefaultFullWidthSpacer()

        if (uiState.isAnonymousAccount) {
            RegularCardEditor(R.string.sign_in, Icons.Default.Settings, "", Modifier.card()) {
                onLoginClick()
            }

            RegularCardEditor(R.string.create_account, Icons.Default.Add, "", Modifier.card()) {
                onSignUpClick()
            }
        } else {
            SignOutCard { onSignOutClick() }
            DeleteMyAccountCard { onDeleteMyAccountClick() }
        }
    }
}

@ExperimentalMaterialApi
@Composable
private fun SignOutCard(signOut: () -> Unit) {
    var showWarningDialog by remember { mutableStateOf(false) }

    RegularCardEditor(R.string.sign_out, Icons.Default.ExitToApp, "", Modifier.card()) {
        showWarningDialog = true
    }

    if (showWarningDialog) {
        AlertDialog(
            title = { Text(stringResource(R.string.sign_out_title)) },
            text = { Text(stringResource(R.string.sign_out_description)) },
            dismissButton = { DialogCancelButton(R.string.cancel) { showWarningDialog = false } },
            confirmButton = {
                DialogConfirmButton(R.string.sign_out) {
                    signOut()
                    showWarningDialog = false
                }
            },
            onDismissRequest = { showWarningDialog = false }
        )
    }
}

@ExperimentalMaterialApi
@Composable
private fun DeleteMyAccountCard(deleteMyAccount: () -> Unit) {
    var showWarningDialog by remember { mutableStateOf(false) }

    DangerCardEditor(
        R.string.delete_my_account,
        Icons.Default.Delete,
        "",
        Modifier.card()
    ) {
        showWarningDialog = true
    }

    if (showWarningDialog) {
        AlertDialog(
            title = { Text(stringResource(R.string.delete_account_title)) },
            text = { Text(stringResource(R.string.delete_account_description)) },
            dismissButton = { DialogCancelButton(R.string.cancel) { showWarningDialog = false } },
            confirmButton = {
                DialogConfirmButton(R.string.delete_my_account) {
                    deleteMyAccount()
                    showWarningDialog = false
                }
            },
            onDismissRequest = { showWarningDialog = false }
        )
    }
}

@Preview(showBackground = true)
@ExperimentalMaterialApi
@Composable
fun SettingsScreenPreview() {
    val uiState = SettingsUiState(isAnonymousAccount = false)

   BookishTheme {
        SettingsScreenContent(
            uiState = uiState,
            onLoginClick = { },
            onSignUpClick = { },
            onSignOutClick = { },
            onDeleteMyAccountClick = { }
        )
    }
}