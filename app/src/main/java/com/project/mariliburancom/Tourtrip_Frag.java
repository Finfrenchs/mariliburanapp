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
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tourtrip_Frag extends Fragment {

    private Toolbar toolBarTourtrip;
    private TextView txtToolBarTourTrip;
    private AppCompatActivity activity;

    public Tourtrip_Frag() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tourtrip_, container, false);
        toolBarTourtrip = (Toolbar) rootView.findViewById(R.id.barTourTrip);
        activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolBarTourtrip);
        activity.getSupportActionBar().setTitle("Tour Trip");
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtToolBarTourTrip = (TextView)rootView.findViewById(R.id.toolbarText_TourTrip);
        if (txtToolBarTourTrip !=null && toolBarTourtrip != null){

            activity.setSupportActionBar(toolBarTourtrip);
        }
        // Inflate the layout for this fragment
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
            Toast.makeText(getActivity(), "Setting done", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
