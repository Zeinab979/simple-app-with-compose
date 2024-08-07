package com.example.simpleappwithcompose.ui.presentation.detailsScreen

import androidx.annotation.StringRes
import com.example.simpleappwithcompose.R

data class DetailsUiState(
    val fork: Int = 347,
    val stars: Int = 1525,
    @StringRes val description: Int = R.string.shared_repository,
    @StringRes val language: Int =R.string.python,
)
