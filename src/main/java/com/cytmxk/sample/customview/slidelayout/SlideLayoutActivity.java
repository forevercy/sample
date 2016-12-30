package com.cytmxk.sample.customview.slidelayout;

import android.support.v4.app.Fragment;
import com.cytmxk.sample.SingleFragmentActivity;

/**
 * Created by chenyang on 16/6/25.
 */
public class SlideLayoutActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new SlideLayoutFragment();
    }
}
