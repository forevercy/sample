package com.cytmxk.sample.customview.waveprogressview;

import android.support.v4.app.Fragment;

import com.cytmxk.sample.SingleFragmentActivity;

/**
 * Created by chenyang on 2016/7/11.
 */
public class WaveProgressViewActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new WaveProgressViewFragment();
    }
}
