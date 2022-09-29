package pl.lanku.inventoryappv2.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "product")
data class Product (
    @PrimaryKey (autoGenerate = true) val id: Int,
    @ColumnInfo(name = "ean_or_ian") val eanOrIan:String,
    @ColumnInfo(name = "product_name") val productName: String,
    @ColumnInfo(name = "category") val category:String?
    )