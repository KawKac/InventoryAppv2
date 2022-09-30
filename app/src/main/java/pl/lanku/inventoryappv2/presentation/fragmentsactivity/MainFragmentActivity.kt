package pl.lanku.inventoryappv2.presentation.fragmentsactivity

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import pl.lanku.inventoryappv2.R
import pl.lanku.inventoryappv2.presentation.fragments.MainFragment

class MainFragmentActivity : FragmentActivity(R.layout.main_fragment) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<MainFragment>(R.id.main_fragment)
            }
        }
    }
}