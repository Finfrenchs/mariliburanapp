package slider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
//import com.smarteist.dicoding.tourandtrip.R;
import com.project.mariliburancom.R;

public class FragmentSlider extends Fragment {

    private SliderView mViewModel;
    private static final String ARG_PARAM1 = "params";
    private String imageUrls;

    public static FragmentSlider newInstance(String params) {
        FragmentSlider fragmentSlider = new FragmentSlider();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, params);
        fragmentSlider.setArguments(args);
        return new FragmentSlider();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        imageUrls = getArguments().getString(ARG_PARAM1);
        View root = inflater.inflate(R.layout.fragment_slider_item, container, false);
        ImageView imgSlider = (ImageView) root.findViewById(R.id.img);
        Glide.with(getActivity())
                .load(imageUrls)
                .placeholder(R.drawable.image_slider_1)
                .into(imgSlider);
        return root;
    }

}
