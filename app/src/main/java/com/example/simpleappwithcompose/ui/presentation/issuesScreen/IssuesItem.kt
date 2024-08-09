package com.example.simpleappwithcompose.ui.presentation.issuesScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpleappwithcompose.R
import com.example.simpleappwithcompose.ui.theme.SimpleAppWithComposeTheme

@Composable
fun IssuesItem(
    uiState: IssuesUiState,
) {
    Column {
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colorScheme.surface,
                    shape = MaterialTheme.shapes.medium
                )
                .padding(12.dp)


        ) {
            Icon(
                painter = painterResource(id = R.drawable.issues_icon),
                contentDescription = "Issues Icon",
                modifier = Modifier
                    .weight(2f)
                    .size(30.dp)


            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(horizontal = 6.dp)
                    .weight(12f)
            ) {
                Text(
                    text = uiState.issues,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight(700),
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurface,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight(400),
                                fontSize = 14.sp,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        ) {
                            append(uiState.description + "\n")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight(700),
                                fontSize = 14.sp,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        ) {
                            append("Created AT:")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight(500),
                                fontSize = 14.sp,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        ) {
                            append(uiState.issuesDate)
                        }
                    },
                    modifier = Modifier.padding(horizontal = 6.dp)
                )
            }
            Text(
                text = uiState.issuesState,
                fontWeight = FontWeight(400),
                modifier = Modifier.weight(2f)
            )
        }
    }
    HorizontalDivider(
        modifier = Modifier.padding(top = 7.dp),
        color = Color.Gray,

    )
}

@Preview(showBackground = true)
@Composable
private fun IssuesItemPreview() {
    SimpleAppWithComposeTheme {
        IssuesItem(
            uiState = IssuesUiState(
            )
        )
    }

}