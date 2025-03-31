package cat.itb.m78.exercices.CountViews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CountViews()
{
    val countViewsViewModel = viewModel {CountViewsViewModel()}
    var countViews = countViewsViewModel.countViews

    CountViews(countViews)
}

@Composable
fun CountViews(countViews: Int)
{
    Box(
        modifier = Modifier.background(color = Color.Black)
            .fillMaxSize()
    )
    {
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            Button(
                onClick = {}
            )
            {
                Text("$countViews")
            }
        }

    }
}