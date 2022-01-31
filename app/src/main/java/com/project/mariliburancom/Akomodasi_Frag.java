package com.project.mariliburancom;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.appbar.AppBarLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Akomodasi_Frag extends Fragment {
    private Toolbar tBAkomodasi;
    private AppBarLayout appBarLayoutakomodasi;
    private AppCompatActivity activity;


    public Akomodasi_Frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_akomodasi_, container, false);
        // Inflate the layout for this fragment
        appBarLayoutakomodasi = (AppBarLayout) rootView.findViewById(R.id.aBLAkomodasi);
        tBAkomodasi = (Toolbar) rootView.findViewById(R.id.toolbarAkomodasi);
        activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(tBAkomodasi);
        activity.getSupportActionBar().setTitle("Akomodasi");
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main_menu_nav, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.itemSetting){
            Toast.makeText(getActivity(), "Setting", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
