package pl.lanku.inventoryappv2.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import pl.lanku.inventoryappv2.data.entity.Product

@Dao
interface ProductDao {
    @Query("SELECT * FROM product")
    fun getAll(): List<Product>

    @Insert
    fun insert(vararg product: Product)

    @Delete
    fun delete(product: Product)
}