package com.example.listactivityexample.ia32examples;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class IA32IfElse extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ia32_if_else);
		
		TextView arithC = (TextView) findViewById (R.id.ifelseC);
		String arithCText1 = "C: \n";
		arithCText1 += "\t if (i == 5) \n";
		arithCText1 += "\t\t a = a + 1; \n";
		arithCText1 += "\t else \n";
		arithCText1 += "\t\t a = a + 2; \n";
		arithC.setText(arithCText1);	
		
		TextView arithIA32 = (TextView) findViewById (R.id.ifelseIA32);
		String arithIA32Text = "IA32: \n";
		arithIA32Text += "NOTE: a is in %ecx, i is in %ebx\n"  + "\n";
		arithIA32Text += "\t cmp %ebx, $5 \n";
		arithIA32Text += "\t je .equals \n";
		arithIA32Text += "\t addl $1, %ecx \n" + "\n";
		arithIA32Text += ".equals: \n";
		arithIA32Text += "\t addl $2, %ecx \n";
		arithIA32.setText(arithIA32Text);
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ia32_if_else, menu);
		return true;
	}

}
