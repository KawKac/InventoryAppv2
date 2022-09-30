package pl.lanku.inventoryappv2.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "product")
data class Product (
    @PrimaryKey (autoGenerate = true) val id: Int,
    @ColumnInfo(name = "eanOrIan") val eanOrIan:String,
    @ColumnInfo(name = "productName") val productName: String,
    @ColumnInfo(name = "category") val category:String?
    )