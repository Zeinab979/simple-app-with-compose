package com.example.simpleappwithcompose.ui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Composable
fun DetailsScreen(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .padding(16.dp)
    ) {
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
                .padding( start = 38.dp,end = 38.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(R.string._1525),
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
                text = "Python",
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
                text = stringResource(R.string._347),
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
            text = stringResource(R.string.shared_repository),
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight(500),
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(horizontal = 16.dp)
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
        DetailsScreen(paddingValues = PaddingValues(0.dp))
    }
}

@Preview(device = Devices.DEFAULT,showBackground = true)
@Composable
private fun DetailsScreenPreviewDefault() {
    SimpleAppWithComposeTheme {
        DetailsScreen(paddingValues = PaddingValues(0.dp))
    }
}

@Preview(device = Devices.PIXEL_4,showBackground = true)
@Composable
private fun DetailsScreenPreviewPixel4() {
    SimpleAppWithComposeTheme {
        DetailsScreen(paddingValues = PaddingValues(0.dp))
    }
}