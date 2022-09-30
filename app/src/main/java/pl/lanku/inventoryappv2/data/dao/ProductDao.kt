package pl.lanku.inventoryappv2.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import pl.lanku.inventoryappv2.data.entity.Product

@Dao
interface ProductDao {
    @Query("SELECT * FROM product")
    fun getAll(): Flow<List<Product>>

    @Query("INSERT INTO product(eanOrIan,productName,category) VALUES( :ean, :name, :category)")
    fun insert(ean: String, name: String, category: String)

    @Delete
    fun delete(product: Product)
}