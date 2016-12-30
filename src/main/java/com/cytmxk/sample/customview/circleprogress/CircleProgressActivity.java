package com.cytmxk.sample.customview.circleprogress;

import android.support.v4.app.Fragment;

import com.cytmxk.sample.SingleFragmentActivity;

/**
 * Created by wb-cy208209 on 2016/8/8.
 */
public class CircleProgressActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CircleProgressFragment();
    }
}
