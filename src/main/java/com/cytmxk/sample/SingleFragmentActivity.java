package com.cytmxk.sample;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import java.util.List;

public abstract class SingleFragmentActivity extends AppCompatActivity {

	protected abstract Fragment createFragment();
	
	protected int getLayoutResId(){
		return R.layout.activity_fragment;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(getLayoutResId());

		FragmentManager fm = getSupportFragmentManager();
		Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
		if (null == fragment) {
			fragment = createFragment();
			fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
		}
	}

	@Override
	protected void onStop() {
		super.onStop();

		if (!isAppOnForeground()) {

		}
	}

	@Override
	protected void onResume() {
		super.onResume();

		if (isAppOnForeground()) {

		}
	}

	/**
	 * 程序是否在前台运行
	 *
	 */
	public boolean isAppOnForeground() {

		ActivityManager activityManager = (ActivityManager) getApplicationContext().getSystemService(Context.ACTIVITY_SERVICE);
		List<ActivityManager.RunningAppProcessInfo> appProcesses = activityManager.getRunningAppProcesses();
		for (ActivityManager.RunningAppProcessInfo appProcess : appProcesses) {
			if (appProcess.processName.equals(getApplicationContext().getPackageName())
					&& (appProcess.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND)) {
				return true;
			}
		}
		return false;
	}
}
