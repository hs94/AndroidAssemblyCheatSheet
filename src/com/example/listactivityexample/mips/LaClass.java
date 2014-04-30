package com.example.listactivityexample.mips;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.anim;
import com.example.listactivityexample.R.id;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class LaClass extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_la_class);
		String text = "la \t rd, label" + "\n" + "Result: rd = 32-bit address of label";
		TextView add = (TextView) findViewById (R.id.mips_la);
		add.setText(text);
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
		getMenuInflater().inflate(R.menu.la_class, menu);
		return true;
	}

}
