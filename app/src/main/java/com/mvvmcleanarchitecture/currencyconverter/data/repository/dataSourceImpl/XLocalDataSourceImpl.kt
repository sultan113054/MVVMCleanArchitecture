package com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSourceImpl

import com.mvvmcleanarchitecture.currencyconverter.data.db.XDAO
import com.mvvmcleanarchitecture.currencyconverter.data.repository.dataSource.XLocalDataSource

class XLocalDataSourceImpl(
    private val articleDAO: XDAO
) : XLocalDataSource {
//    override suspend fun saveArticlesToDB(article: List<Article>) {
//        return articleDAO.insert(article)
//    }
//
//    override suspend fun getSavedArticles(): Flow<List<Article>> {
//        return articleDAO.getAllArticle()
//    }
//
//    override suspend fun deleteAllArticlesFromDB() {
//        return articleDAO.deleteAllArticles()
//    }
}