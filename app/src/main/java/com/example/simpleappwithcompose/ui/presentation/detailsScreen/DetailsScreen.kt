package com.example.simpleappwithcompose.ui.presentation.detailsScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simpleappwithcompose.R
import com.example.simpleappwithcompose.ui.theme.SimpleAppWithComposeTheme
import com.example.simpleappwithcompose.ui.theme.blue
import com.example.simpleappwithcompose.ui.theme.yellow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(
    uiState:DetailsUiState,
    modifier: Modifier
) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =  Alignment.CenterHorizontally,
      modifier = Modifier
          .padding(bottom = 65.dp)
          .fillMaxHeight()
    ) {
        RepoAppBar(
            title = R.string.details_app_bar) {

        }
        Image(
            painter = painterResource(id = R.drawable.icons_google),
            contentDescription = stringResource(R.string.google_logo),
            modifier = Modifier
                .padding(horizontal = 90.dp)
                .size(200.dp)
        )
        Text(
            text = stringResource(R.string.language),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight(700),
            modifier = Modifier.padding(start = 120.dp, end = 110.dp, bottom = 30.dp)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp, end = 50.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = uiState.stars.toString(),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight(500),
                modifier = Modifier.padding(top = 8.dp)

            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "Star",
                tint = yellow,
                modifier = Modifier
                    .padding(8.dp)
                    .size(30.dp)
            )
            Text(
                text = stringResource(uiState.language),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight(500),
                modifier = Modifier.padding(top = 8.dp)

            )
            Icon(
                painter = painterResource(id = R.drawable.baseline_circle_24),
                contentDescription = stringResource(R.string.python_language),
                tint = blue,
                modifier = Modifier
                    .padding(8.dp)
                    .size(30.dp)
            )


            Text(
                text = uiState.fork.toString(),
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight(500),
                modifier = Modifier.padding(top = 8.dp)

            )
            Icon(
                painter = painterResource(id = R.drawable.iconoir_git_fork),
                contentDescription = stringResource(R.string.fork),
                modifier = Modifier
                    .size(50.dp)

            )
        }


        Text(
            text = stringResource(uiState.description),
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight(500),
            modifier = Modifier.padding(horizontal = 30.dp, vertical = 16.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 2.dp)
                .height(60.dp)
                .background(
                    shape = MaterialTheme.shapes.small,
                    color = MaterialTheme.colorScheme.primary
                )
        ) {
            Text(
                stringResource(R.string.show_issues),
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight(700),
            )
        }
    }
}

@Preview(device = Devices.PHONE, showBackground = true)
@Composable
private fun DetailsScreenPreview() {
    SimpleAppWithComposeTheme {
        DetailsScreen(
            uiState = DetailsUiState(
                    fork = 374,
                    language = R.string.python,
                    stars = 1525,
                    description =  R.string.shared_repository,
                    ),
            modifier =Modifier
            )
    }
}