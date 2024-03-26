package com.example.whatsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.Fragment;

public class ThirdFragment extends Fragment {
    ListView friends;
    String[] FriendsList = {"Arpita", "Avni","Dhrumil","Harshit","Hiral","Jinal", "Mummy" ,"Riya","Sehnaaz","Tvisha"};
    String Status[]={"Busy...","Be a beauty be a kind","Urgent Calls Only","Just Chill...","Have a good day","Miracle about to happen","can't talk, whatsapp only","All iz well","STAY HUMBLE","Jai Mahakal"};
    int profile[] = {R.drawable.ak,R.drawable.hl, R.drawable.tv, R.drawable.hu,
            R.drawable.ds, R.drawable.sb, R.drawable.rs, R.drawable.jin,R.drawable.amma,R.drawable.am};
    public ThirdFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v= inflater.inflate(R.layout.fragment_third,container,false);
        friends=(ListView) v.findViewById(R.id.lv);

        CustomAdapter2 customAdapter = new CustomAdapter2(getActivity(), FriendsList, Status,
                profile);

        friends.setAdapter(customAdapter);
        return v;
    }
}
