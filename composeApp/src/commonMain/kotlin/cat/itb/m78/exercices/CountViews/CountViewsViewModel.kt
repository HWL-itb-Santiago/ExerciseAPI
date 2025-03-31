package cat.itb.m78.exercices.CountViews

import androidx.lifecycle.ViewModel
import com.russhwolf.settings.Settings
import com.russhwolf.settings.get

class CountViewsViewModel : ViewModel()
{
    val settings : Settings = Settings()
    var countViews: Int = settings.getInt("views", 0)
    init {
        countViews++;
        settings.putInt("views", countViews)
    }
}