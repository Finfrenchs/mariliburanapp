package com.project.mariliburancom;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.AppBarLayout;
import com.project.mariliburancom._adapter.BrandsTransport_adapter;
import com.project.mariliburancom._adapter.Transportasi_adapter;
import com.project.mariliburancom._model.ModelBrandsCarTrasnport;
import com.project.mariliburancom._model.ModelTransport;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Transport_Frag extends Fragment {
    private Toolbar tbTranport;
    private AppBarLayout appBarLayout;
    private AppCompatActivity activity;
    private TextView txtTitle;
    private RecyclerView recyclerView, recyclerView1;

    ArrayList<ModelTransport> transportsList;
    ArrayList<ModelBrandsCarTrasnport>brandsCarlist;


    public Transport_Frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_transport_, container, false);
        // Inflate the layout for this fragment
        txtTitle = (TextView) rootView.findViewById(R.id.titleTrasnport);

        //toolbar initialitation
        appBarLayout = (AppBarLayout) rootView.findViewById(R.id.appsMenuBar);
        tbTranport = (Toolbar) rootView.findViewById(R.id.tbTransportasi);
        activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(tbTranport);
        activity.setTitle(R.id.titleTrasnport);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //reycycler1
        recyclerView1 = rootView.findViewById(R.id.rv_fg_appbar_transport);

        brandsCarlist = new ArrayList<>();
        brandsCarlist.add(new ModelBrandsCarTrasnport("All"));
        brandsCarlist.add(new ModelBrandsCarTrasnport("Honda"));
        brandsCarlist.add(new ModelBrandsCarTrasnport("Toyota"));
        brandsCarlist.add(new ModelBrandsCarTrasnport("Daihatsu"));
        brandsCarlist.add(new ModelBrandsCarTrasnport("Mitsubitshi"));
        brandsCarlist.add(new ModelBrandsCarTrasnport("Nissan"));
        brandsCarlist.add(new ModelBrandsCarTrasnport("BMW"));
        brandsCarlist.add(new ModelBrandsCarTrasnport("Datsun"));

        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false);
        RecyclerView.LayoutManager rvLayoutLM2 = layoutManager2;
        recyclerView1.setLayoutManager(rvLayoutLM2);

        BrandsTransport_adapter adapter2 = new BrandsTransport_adapter(brandsCarlist);
        recyclerView1.setAdapter(adapter2);

        //reycycler2 initialitation
        recyclerView = rootView.findViewById(R.id.rv_fg_transport);

        transportsList = new ArrayList<>();
        transportsList.add(new ModelTransport(R.drawable.cr_v_2019, "CR-V 2019", "Otomatis Transmition", "IDR 500.000/day",
                "Include Driver", "See Details"));
        transportsList.add(new ModelTransport(R.drawable.cr_v_2019, "CR-V 2019", "Otomatis Transmition", "IDR 500.000/day",
                "Include Driver", "See Details"));
        transportsList.add(new ModelTransport(R.drawable.cr_v_2019, "CR-V 2019", "Otomatis Transmition", "IDR 500.000/day",
                "Include Driver", "See Details"));
        transportsList.add(new ModelTransport(R.drawable.cr_v_2019, "CR-V 2019", "Otomatis Transmition", "IDR 500.000/day",
                "Include Driver", "See Details"));
        transportsList.add(new ModelTransport(R.drawable.cr_v_2019, "CR-V 2019", "Otomatis Transmition", "IDR 500.000/day",
                "Include Driver", "See Details"));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        RecyclerView.LayoutManager rvLayoutLM = layoutManager;

        recyclerView.setLayoutManager(rvLayoutLM);

        Transportasi_adapter adapter = new Transportasi_adapter(transportsList);
        recyclerView.setAdapter(adapter);

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

            Toast.makeText(getActivity(), "setting", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.itemFilter){
            Toast.makeText(getActivity(), "filter", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

}
