package com.mvvmcleanarchitecture.currencyconverter.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mvvmcleanarchitecture.currencyconverter.data.model.articles.model.CurrenciesApiResponse

//@Database(
//    entities = [CurrenciesApiResponse::class],
//    version = 1, exportSchema = false
//
//)

abstract class AppDatabase : RoomDatabase() {
    abstract fun getArticleDAO(): XDAO

    companion object {

        private var INSTANCE: AppDatabase? = null

        private val lock = Any()

        fun getInstance(context: Context): AppDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java, "app.db"
                    ).fallbackToDestructiveMigration()
                        .build()
                }
                return INSTANCE!!
            }
        }
    }
}

