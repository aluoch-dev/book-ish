package com.bookish.app.ui.library

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bookish.R
import com.bookish.app.ui.DefaultSpacer
import com.bookish.app.ui.SubTitleText
import com.bookish.app.ui.TitleText
import com.bookish.app.ui.elements.BasicButton

@Composable
fun Library(
    onNavigateToBookItem: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleText(
            text = "My Library"
        )
        DefaultSpacer()
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.Start
            ) {
                IconButton(onClick = { /* do something */ }) {
                    Icon(Icons.Filled.Add, contentDescription = "Localized description")
                }
            }

            Column(
                horizontalAlignment = Alignment.End
            ) {
                IconButton(onClick = { /* do something */ }) {
                    Icon(Icons.Filled.Settings, contentDescription = "Localized description")
                }
            }
        }
        //Introduce a scrollable list once the storage is set up
        BookItem(onNavigateToBookItem)
        BookItem(onNavigateToBookItem)
        BookItem(onNavigateToBookItem)
        BookItem(onNavigateToBookItem)

        BasicButton(text = R.string.load_more) {}
    }
}

@Composable
fun BookItem(
    onNavigateToBookItem: () -> Unit
) {
    var bookImage = R.drawable.book_cover
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
           Column(
               horizontalAlignment = Alignment.Start
           ) {
               Text(
                   text = "The Little Prince",
                   modifier = Modifier
                       .padding(16.dp),
                   textAlign = TextAlign.Center,
               )
           }
            Column(
                horizontalAlignment = Alignment.End
            ) {
                IconButton(onClick = onNavigateToBookItem ) {
                    Icon(Icons.Filled.Edit, contentDescription = "Localized description")
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewLibrary() {
    Library {}
}