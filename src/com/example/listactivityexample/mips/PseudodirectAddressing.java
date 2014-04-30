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

public class PseudodirectAddressing extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pseudodirect_addressing);
		
		String text = "Summary: the memory address is (mostly) embedded in the instruction.\n" + "\n";
		text += "Example in instruction: j label" + "\n";
		TextView registerAddr = (TextView) findViewById (R.id.mips_pseudodirect_addressing);
		registerAddr.setText(text);
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pseudodirect_addressing, menu);
		return true;
	}

}
