package com.project.mariliburancom._sliders;


import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.project.mariliburancom.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSlider extends Fragment {

    private static final String ARG_PARAM1 = "params";

    private String imageUrls;


    public FragmentSlider() {
        // Required empty public constructor
    }

    public static FragmentSlider newInstance(String params) {
        FragmentSlider fragmentSlider = new FragmentSlider();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, params);
        fragmentSlider.setArguments(args);
        return fragmentSlider;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        imageUrls = getArguments().getString(ARG_PARAM1);

        //Uri uri = Uri.parse("android.resource://com.project.mariliburancom/drawable"+imageUrls);

        View view = inflater.inflate(R.layout.fragment_slider_item,container, false);
        ImageView img = (ImageView) view.findViewById(R.id.img);
        Glide.with(getActivity())
                .load(imageUrls)
                //.load(uri)
                .placeholder(R.drawable.image_slider_1)
                .into(img);
        return view;
    }

}
