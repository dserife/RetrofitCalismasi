package com.example.retrofitcalismasi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.retrofitcalismasi.Model.Posts;
import com.example.retrofitcalismasi.R;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends BaseAdapter {

    private List<Posts> posts;
    private Context context;
    private LayoutInflater layoutInflater;

    TextView tvTitle, tvUserid, tvID,tvBody;



    public PostAdapter(List<Posts> posts, Context context) {
        this.posts = posts;
        this.context = context;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Object getItem(int position) {
        return posts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v= layoutInflater.inflate(R.layout.post_item_layout,null);

        tvID=v.findViewById(R.id.tvId);
        tvUserid=v.findViewById(R.id.tvUserid);
        tvTitle=v.findViewById(R.id.tvTitle);
        tvBody=v.findViewById(R.id.tvBody);

        tvUserid.setText(""+posts.get(position).getUserId());
        tvID.setText(""+posts.get(position).getId());
        tvTitle.setText(""+posts.get(position).getTitle());
        tvBody.setText(""+posts.get(position).getBody());

        return v;
    }
}
