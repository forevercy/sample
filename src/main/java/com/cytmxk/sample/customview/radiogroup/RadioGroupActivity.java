package com.cytmxk.sample.customview.radiogroup;

import android.support.v4.app.Fragment;

import com.cytmxk.sample.SingleFragmentActivity;

/**
 * Created by wb-cy208209 on 2016/7/22.
 */
public class RadioGroupActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment() {
        return new RadioGroupFragment();
    }
}
