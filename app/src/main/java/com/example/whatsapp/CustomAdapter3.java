package com.example.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class CustomAdapter3 extends BaseAdapter {
    Context context1;
    String FriendsList[];
    String day[];
    int profile[];
    LayoutInflater inflater;
    public CustomAdapter3(Context applicationContext, String[] FriendsList, String[] day, int[] profile) {
        this.context1= context1;
        this.FriendsList = FriendsList;
        this.day=day;
        this.profile = profile;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return FriendsList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup parent) {
        v = inflater.inflate(R.layout.fragment_first,null);
        TextView friends = v.findViewById(R.id.text);
        TextView text2=v.findViewById(R.id.text2);
        ImageView pic = v.findViewById(R.id.icon);
        friends.setText(FriendsList[i]);
        text2.setText(day[i]);
        pic.setImageResource(profile[i]);
        return v;
    }
}
