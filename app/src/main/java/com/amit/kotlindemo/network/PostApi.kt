package com.amit.kotlindemo.network


import com.amit.kotlindemo.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {

    /*
     * Get the list post from the Api
      * */
    @GET("/post")
    fun getPost(): Observable<List<Post>>
}