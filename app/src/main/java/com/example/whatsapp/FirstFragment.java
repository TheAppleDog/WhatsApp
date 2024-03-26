package com.example.whatsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
public class FirstFragment extends Fragment{
    ListView friends;
    String[] FriendsList = {"Arpita", "Hiral", "Tvisha","Harshit","Dhrumil","Sehnaaz","Riya", "Jinal","Mummy","Avni"};
    String[] msg={"kkrh","hogaya tera assignment ?","Bye","ttyl lambu","fine mote","chal thik h fir","lets meet tmrw","ok yaar","cya mum","katti"};
     int profile[] = { R.drawable.ak, R.drawable.hl,
                R.drawable.tv, R.drawable.hu, R.drawable.ds,R.drawable.sb,R.drawable.rs, R.drawable.jin,R.drawable.amma,R.drawable.am};
    public FirstFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v= inflater.inflate(R.layout.fragment_first,container,false);
        setHasOptionsMenu(true);
        friends=(ListView) v.findViewById(R.id.l);

        CustomAdapter customAdapter = new CustomAdapter(getActivity(), FriendsList, msg,
                profile);

        friends.setAdapter(customAdapter);

         return v;
       }

      @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        inflater.inflate(R.menu.search_view,menu);
          MenuItem menuitem =menu.findItem(R.id.sv);
          SearchView searchView=(SearchView) MenuItemCompat.getActionView(menuitem);
          searchView.setQueryHint("Search...");
          super.onCreateOptionsMenu(menu,inflater);

      }

}

