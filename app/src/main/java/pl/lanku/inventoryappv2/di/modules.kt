package pl.lanku.inventoryappv2.di

import android.app.Application
import androidx.room.Room
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module
import pl.lanku.inventoryappv2.data.ProductDb
import pl.lanku.inventoryappv2.data.ProductRepository
import pl.lanku.inventoryappv2.data.dao.ProductDao

private const val DB_NAME = "products"

val repositoryModule = module {
    fun provideDb(application: Application): ProductDb =
        Room.databaseBuilder(application, ProductDb::class.java, DB_NAME)
            .fallbackToDestructiveMigration()
            .build()

    fun provideDao(productDb: ProductDb): ProductDao = productDb.ProductDao()

    single { provideDb(androidApplication()) }

    single { ProductRepository(productDao = provideDao(productDb = get())) }
}

//    val viewModelModule = module {
//        viewModel { InventoryViewModel(productsRepository = get(), barcodeScannerUtils = get() }
//    }