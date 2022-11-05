package com.mvvmcleanarchitecture.currencyconverter.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.mvvmcleanarchitecture.currencyconverter.data.db.dao.CurrencyDAO
import com.mvvmcleanarchitecture.currencyconverter.data.db.dao.LatestRateDAO
import com.mvvmcleanarchitecture.currencyconverter.data.model.CurrencyEntity
import com.mvvmcleanarchitecture.currencyconverter.data.model.LatestRateEntity
import com.mvvmcleanarchitecture.currencyconverter.data.util.MapConverter

@Database(
    entities = [CurrencyEntity::class, LatestRateEntity::class],
    version = 1, exportSchema = false

)

@TypeConverters(
    MapConverter::class,
)
abstract class CurrencyDatabase : RoomDatabase() {
    abstract fun getCurrencyDAO(): CurrencyDAO
    abstract fun getLatestRateDAO(): LatestRateDAO

    companion object {

        private var INSTANCE: CurrencyDatabase? = null

        private val lock = Any()

        fun getInstance(context: Context): CurrencyDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        CurrencyDatabase::class.java, "currency-database"
                    ).fallbackToDestructiveMigration()
                        .build()
                }
                return INSTANCE!!
            }
        }
    }
}

