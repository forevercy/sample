package com.cytmxk.sample.customview.togglebutton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cytmxk.sample.R;

/**
 * Created by chenyang on 16/4/17.
 */
public class ToggleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_toggle_button, container, false);
        return root;
    }
}
