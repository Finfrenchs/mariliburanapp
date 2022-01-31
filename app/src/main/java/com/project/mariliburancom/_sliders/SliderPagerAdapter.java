package com.project.mariliburancom._sliders;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SliderPagerAdapter extends FragmentStatePagerAdapter {

    private static final String TAG = "SliderPagerAdapter";

    List<Fragment>mFrags = new ArrayList<>();

    public SliderPagerAdapter(FragmentManager fragmentManager, List<Fragment> frags){
        super(fragmentManager);
        mFrags = frags;
    }

    @Override
    public Fragment getItem(int position) {
        int index = position % mFrags.size();
        return FragmentSlider.newInstance(mFrags.get(index).getArguments().getString("params"));
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }
}
