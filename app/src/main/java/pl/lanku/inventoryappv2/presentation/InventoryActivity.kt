package pl.lanku.inventoryappv2.presentation

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar
import pl.lanku.inventoryappv2.R
import pl.lanku.inventoryappv2.databinding.ActivityProductsBinding

class InventoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}