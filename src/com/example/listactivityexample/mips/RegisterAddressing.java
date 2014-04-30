package com.example.listactivityexample.mips;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class RegisterAddressing extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register_addressing);
		
		String text = "Summary: a source or destination operand is specified as content of one " +
				"of the registers $0-$31. \n" + "\n";
		text += "Example in instruction: add $1, $2, $3" + "\n";
		TextView registerAddr = (TextView) findViewById (R.id.mips_register_addressing);
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
		getMenuInflater().inflate(R.menu.register_addressing, menu);
		return true;
	}

}
