package com.project.mariliburancom;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import com.google.android.material.appbar.AppBarLayout;
import com.project.mariliburancom._sliders.FragmentSlider;
import com.project.mariliburancom._sliders.SliderIndicator;
import com.project.mariliburancom._sliders.SliderPagerAdapter;
import com.project.mariliburancom._sliders.SliderView;


public class Home_Frag extends Fragment {

    private SliderPagerAdapter mAdapter;
    private SliderIndicator mIndicator;
    private SliderView sliderView;
    private LinearLayout mLinearLayout;
    private Toolbar toolBarHome;
    private ImageView ImgToolBarHome;
    private AppCompatActivity activity;
     //ScrollView scrollView;
     //AppBarLayout appBarLayout;

    public Home_Frag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home_, container, false);
        // Inflate the layout for this fragment
        //scrollView = (ScrollView) rootView.findViewById(R.id.schroll);
        //appBarLayout = (AppBarLayout) rootView.findViewById(R.id.barmenu);
        sliderView = (SliderView) rootView.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        setupSlider();
        //setupSliderOffline();

        toolBarHome = (Toolbar) rootView.findViewById(R.id.barHome);
        activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolBarHome);

        ImgToolBarHome = (ImageView) rootView.findViewById(R.id.imageHome);
        if (ImgToolBarHome !=null && toolBarHome != null){
            activity.setSupportActionBar(toolBarHome);
        }
        return rootView;
    }

    private void setupSlider(){
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-1.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-2.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-3.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/image-slider-4.jpg"));

        mAdapter = new SliderPagerAdapter(getFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new SliderIndicator(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }

    //private void setupSliderOffline(){
        //sliderView.setDurationScroll(800);
       // List<Fragment> fragments = new ArrayList<>();
        //fragments.add(FragmentSlider.newInstance("image-slider-1.jpg"));
        ///fragments.add(FragmentSlider.newInstance("image-slider-2.jpg"));
        //fragments.add(FragmentSlider.newInstance("image-slider-1.jpg"));
        //fragments.add(FragmentSlider.newInstance("image-slider-2.jpg"));

        //mAdapter = new SliderPagerAdapter(getFragmentManager(), fragments);
        //sliderView.setAdapter(mAdapter);
        //mIndicator = new SliderIndicator(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        //mIndicator.setPageCount(fragments.size());
        //mIndicator.show();
   //}

}
