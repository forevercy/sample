package com.cytmxk.sample.customview.flowlayout;

import android.support.v4.app.Fragment;
import com.cytmxk.sample.SingleFragmentActivity;

/**
 * Created by chenyang on 16/6/18.
 */
public class FlowLayoutActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new FlowLayoutFragment();
    }
}
