package com.anujjain.getMegaAssignment.network

import retrofit2.http.GET

interface RetrofitApiInterface {
    @GET("/repositories")
    suspend fun getTrendingRepos(): List<TrendingRepoDataModel?>?
}