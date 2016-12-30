package com.cytmxk.sample.customview.swipelayout;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.cytmxk.customview.swipelayout.SwipeLayout;
import com.cytmxk.sample.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by chenyang on 2016/7/14.
 */
public class ListViewFragment extends Fragment implements SwipeLayout.OnSwipeListener {

    private ListView mListView;
    private ArrayList<String> data = new ArrayList<String>();
    private MyAdapter myAdapter = new MyAdapter();
    private ArrayList<SwipeLayout> views = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_listview, container, false);
        mListView = (ListView) root.findViewById(R.id.lv_swipe_layout);
        mListView.setOnScrollListener(new AbsListView.OnScrollListener() {
            /**
             * 该方法的调用次数受参数scrollState的影响，如果用户做了一个手指抛动的动作，该方法会被调用3次，否者调用2次
             */
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
                switch (scrollState) {
                    case SCROLL_STATE_IDLE: // 滚动停止时被调用
                        break;
                    case SCROLL_STATE_TOUCH_SCROLL: //滚动时被调用
                        updateListView();
                        break;
                    case SCROLL_STATE_FLING: //手指抛动时被调用
                        break;
                }
            }

            /**
             * 滚动时一直被调用
             */
            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

            }
        });
        for (int i = 0; i < 20; i++) {
            data.add("我是谁" + i);
        }
        mListView.setAdapter(myAdapter);
        return root;
    }

    private void updateListView() {
        for (SwipeLayout swipeLayout : views) {
            if (null != swipeLayout && swipeLayout.isOpen()) {
                swipeLayout.close();
            }
        }
    }

    private void updateListView(SwipeLayout exceptItem) {

        for (SwipeLayout swipeLayout : views) {
            if (null != swipeLayout && exceptItem != swipeLayout) {
                if (swipeLayout.isOpen()) {
                    swipeLayout.close();
                }
            }
        }
    }

    private void addSwipeLayout(SwipeLayout swipeLayout) {
        if (views.contains(swipeLayout)) {
            views.remove(swipeLayout);
        }
        views.add(swipeLayout);
    }

    @Override
    public void onExpansion(SwipeLayout swipeLayout) {
        updateListView(swipeLayout);
    }

    @Override
    public void onClose(SwipeLayout swipeLayout) {

    }

    private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return data.size();
        }

        @Override
        public Object getItem(int position) {
            return data.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder = null;
            if (null == convertView) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.swipelayout_item, parent, false);
                viewHolder = new ViewHolder();
                viewHolder.textView = (TextView) convertView.findViewById(R.id.tv_name);
                viewHolder.ivEdit = (ImageView) convertView.findViewById(R.id.iv_edit);
                viewHolder.ivDelete = (ImageView) convertView.findViewById(R.id.iv_delete);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
            ((SwipeLayout)convertView).setOnSwipeListener(ListViewFragment.this);
            addSwipeLayout((SwipeLayout)convertView);
            viewHolder.textView.setText(data.get(position));
            return convertView;
        }

        public final class ViewHolder {
            TextView textView;
            ImageView ivEdit;
            ImageView ivDelete;
        }
    }
}
