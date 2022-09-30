package pl.lanku.inventoryappv2.data

import kotlinx.coroutines.flow.Flow
import pl.lanku.inventoryappv2.data.dao.ProductDao
import pl.lanku.inventoryappv2.data.entity.Product

class ProductRepository(
    private val productDao: ProductDao
) {
    val allProducts: Flow<List<Product>> = productDao.getAll()

    fun insertIntoDatabase(ean:String, name:String, category:String) = productDao.insert(ean, name, category)
}