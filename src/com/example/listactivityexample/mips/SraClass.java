package com.example.listactivityexample.mips;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class SraClass extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sra_class);
		
		String text = "srl rd, rs, shift5" + "\n" + "Result: rd = rs >> shift5 (arithmetic shift)";
		TextView add = (TextView) findViewById (R.id.mips_sra);
		add.setText(text);
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sra_class, menu);
		return true;
	}

}
