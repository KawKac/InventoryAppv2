package pl.lanku.inventoryappv2.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Product (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "product_name") val productName: String,
    @ColumnInfo(name = "ean_or_ian") val eanOrIan:String,
    @ColumnInfo(name = "description") val description:String?
    )