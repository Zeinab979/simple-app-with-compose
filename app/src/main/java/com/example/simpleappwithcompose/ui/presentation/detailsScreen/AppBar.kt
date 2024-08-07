package com.example.simpleappwithcompose.ui.presentation.detailsScreen

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.simpleappwithcompose.R
import com.example.simpleappwithcompose.ui.theme.SimpleAppWithComposeTheme
import com.example.simpleappwithcompose.ui.theme.black

@ExperimentalMaterial3Api
@Composable
fun RepoAppBar(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
   // titleStyle: TextStyle = MaterialTheme.typography.titleLarge,
    color: Color = MaterialTheme.colorScheme.primary,
    showBackButton: Boolean = true,
    onBackButtonClicked: () -> Unit,
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                stringResource(title),
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight(700),            )
        },
        modifier = modifier.background(color),
        navigationIcon = {
            if (showBackButton) {
                IconButton(onClick = onBackButtonClicked) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.back),
                            tint = black,
                        )

                }
            }
        }
    )
}

@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewRepoAppBar() {
    SimpleAppWithComposeTheme {
        RepoAppBar(
            title = R.string.details_app_bar
        ) {

        }
    }
}