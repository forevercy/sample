package com.cytmxk.sample.customview.coupon;

import android.support.v4.app.Fragment;
import com.cytmxk.sample.SingleFragmentActivity;

/**
 * Created by chenyang on 2016/6/30.
 */
public class CouponViewActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CouponViewFragment();
    }
}
