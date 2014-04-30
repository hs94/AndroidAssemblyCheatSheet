package com.example.listactivityexample.ia32examples;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class IA32Arithmetic extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ia32_arithmetic);
		
		TextView arithC = (TextView) findViewById (R.id.arithmeticC);
		String arithCText1 = "C: \n";
		arithCText1 += "\ti = a + b; \n";
		arithCText1 += "\tc = i + 5; \n";
		arithC.setText(arithCText1);
		
		TextView arithIA32 = (TextView) findViewById (R.id.arithmeticIA32);
		String arithIA32Text = "IA32: \n";
		arithIA32Text += "NOTE: a is in %ecx, b is in %ebx, i in %edx, c in %eax \n"  + "\n";
		arithIA32Text += "\t movl %ecx, %edx \n";
		arithIA32Text += "\t addl %ebx, %edx \n";
		arithIA32Text += "\t movl %edx, %eax \n";
		arithIA32Text += "\t addl $5, %eax \n";
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
		getMenuInflater().inflate(R.menu.ia32_arithmetic, menu);
		return true;
	}

}
