package com.example.retrofitcalismasi.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PostResponse {

    @SerializedName("posts") //json formatındaki arrayin adı
    public List<Posts> postsList;

    public List<Posts> getPostsList() {
        return postsList;
    }

    public void setPostsList(List<Posts> postsList) {
        this.postsList = postsList;
    }
}
