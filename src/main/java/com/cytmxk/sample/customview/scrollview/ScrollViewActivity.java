package com.cytmxk.sample.customview.scrollview;

import android.support.v4.app.Fragment;
import com.cytmxk.sample.SingleFragmentActivity;

/**
 * Created by chenyang on 16/4/19.
 */
public class ScrollViewActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new ScrollViewFragment();
    }
}
