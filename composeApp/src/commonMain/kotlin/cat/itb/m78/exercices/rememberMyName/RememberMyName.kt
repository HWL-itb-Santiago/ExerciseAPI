package cat.itb.m78.exercices.rememberMyName

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun RememberMyName()
{
    val RememberMyNameViewModel = viewModel { RememberMyNameViewModel() }
    val name = RememberMyNameViewModel.getMyName
    RememberMyName(name, RememberMyNameViewModel::SetMyName)
}

@Composable
fun RememberMyName(myName : String, save: (String) -> Unit)
{
    var input by remember {mutableStateOf(myName)}
    Column {
        TextField(
            value = input,
            onValueChange = {input = it},
            label = { Text("Hello ${myName}")}
        )
        Button(
            onClick = {save(input)}
        )
        {
            Text(text = "GUARDAR")
        }
    }

}