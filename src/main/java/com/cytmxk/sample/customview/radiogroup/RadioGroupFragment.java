package com.cytmxk.sample.customview.radiogroup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cytmxk.customview.radiogroup.CRadioGroup;
import com.cytmxk.sample.R;

/**
 * Created by wb-cy208209 on 2016/7/22.
 */
public class RadioGroupFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_radio_group, container, false);
        ((CRadioGroup)root.findViewById(R.id.crg_test)).setOnItemClickListener(new CRadioGroup.OnItemClickListener() {
            @Override
            public void onItemClick(View view, long id) {

            }
        });
        return root;
    }
}
