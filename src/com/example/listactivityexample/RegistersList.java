package com.example.listactivityexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class RegistersList extends Activity {

	public RegistersList () {}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registers_list);
	}
	
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.registers_list, menu);
		return true;
	}

}
