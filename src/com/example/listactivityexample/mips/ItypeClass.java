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

public class ItypeClass extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_itype_class);
		String text = "Example: lw $t0, 4($t1) \n";
		text += "Total bits in address: 32 \n";
		text += "6 bits for opcode (depends on instruction) \n";
		text += "5 bits for rs ($t1) \n";
		text += "5 bits for rt ($t2) \n";
		text += "16 bits for address (4 + address in t1, in this case) \n";
		TextView add = (TextView) findViewById (R.id.mips_itype);
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
		getMenuInflater().inflate(R.menu.itype_class, menu);
		return true;
	}

}
