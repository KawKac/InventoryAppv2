package pl.lanku.inventoryappv2.data

import androidx.room.Database
import androidx.room.RoomDatabase
import pl.lanku.inventoryappv2.data.dao.ProductDao
import pl.lanku.inventoryappv2.data.entity.Product

@Database(entities = [Product::class], version = 1)
abstract class ProductDb : RoomDatabase() {
    abstract fun ProductDao() : ProductDao
}