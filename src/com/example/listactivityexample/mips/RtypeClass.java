package com.example.listactivityexample.mips;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class RtypeClass extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rtype_class);
		String text = "Example: add $t0, $t1, $t2 \n";
		text += "Total bits in address: 32 \n";
		text += "6 bits for opcode (depends on instruction) \n";
		text += "5 bits for rd ($t0) \n";
		text += "5 bits for rs ($t1) \n";
		text += "5 bits for rt ($t2) \n";
		text += "5 bits for shamt (shift amount; 0 in this case) \n";
		text += "6 bits for function code (depends on instruction) \n";
		TextView add = (TextView) findViewById (R.id.mips_rtype);
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
		getMenuInflater().inflate(R.menu.rtype_class, menu);
		return true;
	}

}
