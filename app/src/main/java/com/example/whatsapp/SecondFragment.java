package com.example.whatsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
public class SecondFragment extends Fragment{
    ListView friends;
    String FriendsList[]={"Tvisha","Dhrumil"};
    int profile[]={R.drawable.tv,R.drawable.ds};
    String day[]={"Today, 13:02","Yesterday, 00:05"};
    public SecondFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_second, container, false);
        friends = (ListView) v.findViewById(R.id.lv);

        CustomAdapter3 customAdpter = new CustomAdapter3(getActivity(), FriendsList, day,
                profile);
        friends.setAdapter(customAdpter);
        friends.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(SecondFragment.this.getActivity(), Tvishastatus.class)); ;
                }
                else{
                    startActivity(new Intent(SecondFragment.this.getActivity(),dhrumilstatus.class));
                }
            }
        });
        return v;
    }
}