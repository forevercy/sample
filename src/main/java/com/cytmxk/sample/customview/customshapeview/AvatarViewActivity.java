package com.cytmxk.sample.customview.customshapeview;

import android.support.v4.app.Fragment;
import com.cytmxk.sample.SingleFragmentActivity;

/**
 * Created by chenyang on 2016/7/4.
 */
public class AvatarViewActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new AvatarViewFragment();
    }
}
