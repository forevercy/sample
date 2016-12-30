package com.cytmxk.sample.customview.waveprogressview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cytmxk.sample.R;

/**
 * Created by chenyang on 2016/7/11.
 */
public class WaveProgressViewFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_wave_progress_view, container, false);
        return root;
    }
}
