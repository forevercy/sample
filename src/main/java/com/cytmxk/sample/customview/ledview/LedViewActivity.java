package com.cytmxk.sample.customview.ledview;

import android.support.v4.app.Fragment;
import com.cytmxk.sample.SingleFragmentActivity;

/**
 * Created by chenyang on 2016/7/8.
 */
public class LedViewActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new LedViewFragment();
    }
}
