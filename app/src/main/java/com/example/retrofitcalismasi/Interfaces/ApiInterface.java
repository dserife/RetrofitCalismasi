package com.example.retrofitcalismasi.Interfaces;

import com.example.retrofitcalismasi.Model.PostResponse;
import com.example.retrofitcalismasi.Model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("posts")
    Call<List<Posts>> getPosts(@Query("api_key") String apiKey);
}

