package com.cytmxk.sample.customview.ringwave;

import android.support.v4.app.Fragment;
import com.cytmxk.sample.SingleFragmentActivity;

/**
 * Created by chenyang on 16/4/21.
 */
public class RingWaveActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RingWaveFragment();
    }
}
