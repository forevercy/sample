package com.cytmxk.sample.customview.scrollview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.cytmxk.customview.scrolllview.MyScrollView;
import com.cytmxk.sample.R;

/**
 * Created by chenyang on 16/4/19.
 */
public class ScrollViewFragment extends Fragment {

    private MyScrollView mMyScrollView;
    private RadioGroup mRgSelectPager;

    //图片资源ID 数组
    private int[] ids = new int[]{R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6};

    private int[] girlsIds = new int[]{R.drawable.default1, R.drawable.girl1, R.drawable.girl2, R.drawable.girl3};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_scroll_view, container, false);
        mMyScrollView = (MyScrollView) root.findViewById(R.id.sv_pager_view);
        mRgSelectPager = (RadioGroup) root.findViewById(R.id.rg_select_pager);
        initView();
        return root;
    }

    private void initView() {

        for (int i = 0; i < ids.length; i++) {
            ImageView imageview = new ImageView(this.getContext());
            imageview.setBackgroundResource(ids[i]);
            mMyScrollView.addView(imageview);
        }
        View waterfall = LayoutInflater.from(getContext()).inflate(R.layout.msv_item_waterfall, null);
        ((ListView)waterfall.findViewById(R.id.lv_first)).setAdapter(new ImageAdapter());
        ((ListView)waterfall.findViewById(R.id.lv_second)).setAdapter(new ImageAdapter());
        ((ListView)waterfall.findViewById(R.id.lv_three)).setAdapter(new ImageAdapter());
        mMyScrollView.addView(waterfall, 2);

        mMyScrollView.setOnPagerChangeListener(new MyScrollView.OnPagerChangeListener() {
            @Override
            public void OnPagerChange(int index) {
                ((RadioButton) mRgSelectPager.getChildAt(index)).setChecked(true);
            }
        });


        int count = mMyScrollView.getChildCount();
        for (int i = 0; i < count; i++) {
            RadioButton radioButton = new RadioButton(getContext());
            radioButton.setId(i);
            if (i == 0) {
                radioButton.setChecked(true);
            }
            mRgSelectPager.addView(radioButton);
        }

        mRgSelectPager.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                mMyScrollView.moveToDest(checkedId);
            }
        });
    }

    private class ImageAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 400;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if (null == convertView) {
                ImageView imageView = new ImageView(ScrollViewFragment.this.getContext());
                imageView.setBackgroundResource(girlsIds[(int) (Math.random() * 4)]);
                convertView = imageView;
            } else {
                ((ImageView)convertView).setBackgroundResource(girlsIds[(int) (Math.random() * 4)]);
            }
            return convertView;
        }
    }
}
