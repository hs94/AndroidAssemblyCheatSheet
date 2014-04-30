package com.example.listactivityexample.mips;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;
import com.example.listactivityexample.touch.TouchImageView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MIPSRegisters extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mipsregisters);
		
		/*TouchImageView iv = (TouchImageView) findViewById (R.id.mips_registers_image);
		iv.getLayoutParams().height = 768/2;*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mipsregisters, menu);
		return true;
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}


}
