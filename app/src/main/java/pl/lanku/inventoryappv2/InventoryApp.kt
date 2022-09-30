package pl.lanku.inventoryappv2

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import pl.lanku.inventoryappv2.di.repositoryModule

class InventoryApp : Application(){
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        startKoin {
            androidContext(this@InventoryApp)
            modules(listOf(repositoryModule))
        }
    }
}