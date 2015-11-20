package com.sudhir.android.fitnessguru;

import com.sudhir.android.fitnessguru.fragment.Map_Fragment;
import com.sudhir.android.fitnessguru.fragment.SearchFragmens;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class ClientSignUpFragment extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Map_Fragment mapfrag = new Map_Fragment();
        SearchFragmens searchFrag = new SearchFragmens();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.map_container, mapfrag, "Map");
        transaction.add(R.id.search_container, searchFrag, "Search");
        transaction.commit();
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, new PlaceholderFragment())
//                    .commit();
//        }
    }
}
