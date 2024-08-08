package com.example.simpleappwithcompose.ui.presentation.issuesScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simpleappwithcompose.R
import com.example.simpleappwithcompose.ui.presentation.detailsScreen.RepoAppBar
import com.example.simpleappwithcompose.ui.theme.SimpleAppWithComposeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IssuesScreen(
) {
    Column(
        modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)) {
        RepoAppBar(title = R.string.issues) {

        }
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .padding(vertical = 10.dp, horizontal = 10.dp)
        ) {
            items(10) {
                IssuesItem(
                    uiState = IssuesUiState(
                    )
                )
            }
        }

    }
}
@Preview(showBackground = true)
@Composable
private fun IssuesScreenPreview() {
    SimpleAppWithComposeTheme {
        IssuesScreen()
    }

}