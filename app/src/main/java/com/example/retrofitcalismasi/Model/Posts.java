package com.example.retrofitcalismasi.Model;

import com.google.gson.annotations.SerializedName;

public class Posts {
 //gson kütüphanesine ait bir anotasyon. gson veri içerisindeki kolonu doğrudan kendisi parçalıyor./
 // ve parçaladığı veriyi bir alt satırdaki field içine doldurmuş oluyor.
    @SerializedName("userId")
    private String userId;

    @SerializedName("id")
    private String id;

    @SerializedName("title")
    private String title;

    @SerializedName("body")
    private String body;

    public Posts() {
    }

    public Posts(String userId, String id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
