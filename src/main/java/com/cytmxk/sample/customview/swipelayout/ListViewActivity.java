package com.cytmxk.sample.customview.swipelayout;

import android.support.v4.app.Fragment;

import com.cytmxk.sample.SingleFragmentActivity;

/**
 * Created by chenyang on 2016/7/14.
 */
public class ListViewActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new ListViewFragment();
    }
}
