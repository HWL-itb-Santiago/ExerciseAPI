package cat.itb.m78.exercices.rememberMyName

import androidx.lifecycle.ViewModel
import com.russhwolf.settings.Settings

class RememberMyNameViewModel : ViewModel()
{
    val settings : Settings = Settings()

    var getMyName = settings.getString("name", "")

    fun SetMyName(newName: String)
    {
        settings.putString("name", newName)
    }
}