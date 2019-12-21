package com.acronymslutions.dbbikers

import android.util.Base64
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApplicationRClient {
    private val AUTH = "Basic " + Base64.encodeToString(
        "Ashu:123456".toByteArray(),
        Base64.NO_WRAP
    )
    private const val BASE_URL = "http://acronymsolutions.in/Bikers/API/public/"
    private  val okHttpClient=OkHttpClient.Builder()
        .addInterceptor{chain ->
            val original=chain.request()

            val requestBuilder=original.newBuilder()
                .addHeader("Auhtorization",AUTH)
                .method(original.method(),original.body())

            val request=requestBuilder.build()
            chain.proceed(request)

        }.build()


    val instance: Api by lazy{
        val retrofit=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

        retrofit.create(Api::class.java)
    }
}


