package pl.lanku.inventoryappv2

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class InventoryApp : Application(){
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}