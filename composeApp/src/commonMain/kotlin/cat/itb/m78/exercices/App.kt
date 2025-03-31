package cat.itb.m78.exercices

import cat.itb.m78.exercices.CountViews.CountViews
import cat.itb.m78.exercices.theme.AppTheme
import androidx.compose.runtime.Composable
import cat.itb.m78.exercices.rememberMyName.RememberMyName

@Composable
internal fun App() = AppTheme {
    RememberMyName()
}
