package com.imaginato.test.data.model.api

import com.imaginato.test.data.model.remote.request.ReqUserLogin
import com.imaginato.test.data.model.remote.response.RUserData
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Purpose -
 *
 * @author Alpesh Rathod
 *
 * Created on 2/1/21
 */
interface ApiService {
    @POST("login")
    suspend fun userLogin(@Body request: ReqUserLogin): Response<RUserData>
}