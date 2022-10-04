package pl.lanku.inventoryappv2.presentation.products

import androidx.lifecycle.ViewModel
import pl.lanku.inventoryappv2.data.ProductRepository

class AddNewProductViewModel(
    private val productRepository: ProductRepository
) : ViewModel() {

    lateinit var eanOrIan : String
    lateinit var productName : String
    lateinit var productCategory :String

    fun insertDataToDatabase(ean:String, name:String, category:String){
        productRepository.insertIntoDatabase(ean,name,category)
    }
}