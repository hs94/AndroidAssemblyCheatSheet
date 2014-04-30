package com.example.listactivityexample.ia32examples;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class IA32Functions extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ia32_functions);
		
		String functionCText = "C: \n";
		functionCText += "void swap (int *xp, int *yp) {\n";
		functionCText += "\t int t0 = *xp; \n";
		functionCText += "\t int t1 = *yp; \n";
		functionCText += "\t *xp = t1; \n";
		functionCText += "\t *yp = t0; \n";
		functionCText += "} \n";
		
		String functionIA32Text = "IA32: \n" + "\n";
		functionIA32Text += "swap: \n";
		functionIA32Text += "\t push %ebp \n";
		functionIA32Text += "\t movl %esp, %ebp \n";
		functionIA32Text += "\t pushl %ebx \n" + "\n";
		functionIA32Text += "\t movl 8(%ebp), %edx \n";
		functionIA32Text += "\t movl 12(%ebp), %eax \n";
		functionIA32Text += "\t movl 12(%ebp), %eax \n";
		functionIA32Text += "\t movl (%eax), %ebx \n";
		functionIA32Text += "\t movl %ebx, (%edx) \n";
		functionIA32Text += "\t movl %ecx, (%eax) \n" + "\n";
		functionIA32Text += "\t popl %ebx \n";
		functionIA32Text += "\t popl %ebp \n";
		functionIA32Text += "\t ret \n";
		
		TextView functionC = (TextView) findViewById (R.id.functionC);
		TextView functionIA32 = (TextView) findViewById (R.id.functionIA32);
		functionC.setText(functionCText);
		functionIA32.setText(functionIA32Text);

	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ia32_functions, menu);
		return true;
	}

}
