package com.example.listactivityexample.mips;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class PCRelativeAddressing extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pcrelative_addressing);
		String text = "Summary: a data or instruction memory location is specified as an " +
				"offset relative to the incremented PC. \n" + "\n";
		text += "Example in instruction: bne $1, $2, end" + "\n";
		TextView registerAddr = (TextView) findViewById (R.id.mips_pcrelative_addressing);
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
		getMenuInflater().inflate(R.menu.pcrelative_addressing, menu);
		return true;
	}

}
