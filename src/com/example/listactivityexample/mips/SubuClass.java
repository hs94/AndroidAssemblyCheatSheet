package com.example.listactivityexample.mips;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class SubuClass extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_subu_class);
		String text = "sub \t rd, rs, rt" + "\n" + "Result: rd = rs - rt (unsigned)";
		TextView add = (TextView) findViewById (R.id.mips_subu);
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
		getMenuInflater().inflate(R.menu.subu_class, menu);
		return true;
	}

}
