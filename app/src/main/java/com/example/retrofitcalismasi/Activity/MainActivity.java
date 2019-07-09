package com.example.retrofitcalismasi.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.retrofitcalismasi.Adapter.PostAdapter;
import com.example.retrofitcalismasi.Helper.ApiClient;
import com.example.retrofitcalismasi.Interfaces.ApiInterface;
import com.example.retrofitcalismasi.Model.PostResponse;
import com.example.retrofitcalismasi.Model.Posts;
import com.example.retrofitcalismasi.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    PostAdapter postAdapter;
    List<Posts> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        ApiInterface apiInterface= ApiClient.getClient().create(ApiInterface.class);
        Call<List<Posts>> call= apiInterface.getPosts("");

        call.enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                posts= response.body();
                postAdapter= new PostAdapter(posts,getApplicationContext());
                listView.setAdapter(postAdapter);
            }

            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {
                Log.d("HATA",t.getMessage());
            }
        });
    }
}
