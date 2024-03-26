package com.example.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class CustomAdapter extends BaseAdapter {
    Context context1;
    String FriendsList[];
    String msg[];
    int profile[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, String[] FriendsList, String[] msg, int[] profile) {
        this.context1= context1;
        this.FriendsList = FriendsList;
        this.msg=msg;
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
    public View getView(int i, View v, ViewGroup viewGroup) {
        v = inflater.inflate(R.layout.fragment_first,null);
        TextView friends = v.findViewById(R.id.text);
        TextView text2=v.findViewById(R.id.text2);
        ImageView pic = v.findViewById(R.id.icon);
        friends.setText(FriendsList[i]);
        text2.setText(msg[i]);
        pic.setImageResource(profile[i]);
        return v;
    }


}
