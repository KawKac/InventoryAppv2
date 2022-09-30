package pl.lanku.inventoryappv2.presentation.products

import androidx.lifecycle.ViewModel

class InventoryViewModel : ViewModel() {
    lateinit var ean_or_ian : String
    lateinit var product_name : String
    lateinit var product_category :String

    fun insertDataToDatabase(ean:String, name:String, category:String){

    }

}