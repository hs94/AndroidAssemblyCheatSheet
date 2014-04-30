package com.example.listactivityexample.ia32examples;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class IA32Recursion extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ia32_recursion);
		
		String recursionCText = "C: \n";
		recursionCText += "int pcount_r(unsigned x) { \n";
		recursionCText += "\t if (x == 0) \n";
		recursionCText += "\t" + "\t return 0; \n";
		recursionCText += "\t else \n";
		recursionCText += "\t" + "\t return (x & 1) + pcount_r(x >> 1); \n" + "}\n";
		
		String recursionIA32Text = "IA32: \n";
		recursionIA32Text += "pcount_r: \n";
		recursionIA32Text += "\t push %ebp \n";
		recursionIA32Text += "\t movl %esp, %ebp \n";
		recursionIA32Text += "\t pushl %ebx \n";
		recursionIA32Text += "\t subl $20, %esp \n";
		recursionIA32Text += "\t movl 8(%ebp), %ebx \n";
		recursionIA32Text += "\t movl $0, %eax \n";
		recursionIA32Text += "\t testl %ebx, %ebx \n";
		recursionIA32Text += "\t je .L3 \n";
		recursionIA32Text += "\t movl %ebx, %eax \n";
		recursionIA32Text += "\t shrl %eax \n";
		recursionIA32Text += "\t movl %eax, (%esp) \n";
		recursionIA32Text += "\t call pcount_r \n";
		recursionIA32Text += "\t movl %ebx, %edx \n";
		recursionIA32Text += "\t andl $1, %edx \n";
		recursionIA32Text += "\t addl %edx, %eax \n";
		recursionIA32Text += ".L3: \n";
		recursionIA32Text += "\t addl $20, %esp \n";
		recursionIA32Text+= "\t popl %ebx \n";
		recursionIA32Text+= "\t popl %ebp \n";
		recursionIA32Text+= "\t ret \n";
		
		TextView recursionC = (TextView) findViewById (R.id.recursionC);
		TextView recursionIA32 = (TextView) findViewById (R.id.recursionIA32);
		recursionC.setText(recursionCText);
		recursionIA32.setText(recursionIA32Text);
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ia32_recursion, menu);
		return true;
	}

}
