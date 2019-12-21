package com.acronymslutions.dbbikers

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {
    @FormUrlEncoded
    @POST("createuser")
    fun createUser(
        @Field("Name") Name:String,
        @Field("Email") Email:String,
        @Field("Phone") Phone:String,
        @Field("Password") Password:String
    ): Call<DefaultResponse>
}