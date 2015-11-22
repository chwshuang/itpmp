package com.android.example.uis;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class SettingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		  setContentView(R.layout.setting);
		  ActivityCollector.addActivity(this);
	} 

	public static void actionStart(Context context){
		Intent intent = new Intent(context, SettingActivity.class);
		context.startActivity(intent);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}
}
