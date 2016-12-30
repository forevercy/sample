package com.cytmxk.sample.customview.togglebutton;

import android.support.v4.app.Fragment;
import com.cytmxk.sample.SingleFragmentActivity;

/**
 * Created by chenyang on 16/4/17.
 */
public class ToggleButtonActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new ToggleFragment();
    }
}
