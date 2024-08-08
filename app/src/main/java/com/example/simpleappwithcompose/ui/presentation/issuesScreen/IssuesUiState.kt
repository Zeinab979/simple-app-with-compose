package com.example.simpleappwithcompose.ui.presentation.issuesScreen

data class IssuesUiState(
    val issues: String = "issuesName",
    val issuesState: String = "Open",
    val issuesDate: String = "2022-05-22, 10:00 AM",
    val description : String = "NONE",
)