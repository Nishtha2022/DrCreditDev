package com.example.drcreditdev.services

import com.example.drcreditdev.dataModal.reqCreditScore
import com.example.drcreditdev.dataModal.reqGenrateOtp
import com.example.drcreditdev.dataModal.reqVerify
import com.example.drcreditdev.dataModal.resVerify
import com.example.example.ExampleJson2KtKotlin
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.HeaderMap
import retrofit2.http.Headers
import retrofit2.http.POST

interface RetrofitApi {
    @POST("requestOTP")
    fun createPost(@Body dataModal: reqGenrateOtp?): Call<ResponseBody?>?
   @POST("verifyOTP")
    fun login(@Body dataModal: reqVerify?): Call<resVerify?>?


    @POST("UnverifiedUser")
    fun fetchCreditScore(@HeaderMap headers: HashMap<String,String>,@Body dataModal:reqCreditScore?):Call<ExampleJson2KtKotlin?>?


}