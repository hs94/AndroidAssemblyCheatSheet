package com.example.listactivityexample.ia32examples;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class IA32ForLoop extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ia32_for_loop);
		
		TextView forloopC = (TextView) findViewById (R.id.forloopC);
		String forloopCText = "C: \n";
		forloopCText += "\t int sum = 0; \n";
		forloopCText += "\t for (int i = 0; i < 10; i++)\n";
		forloopCText += "\t" + "\t a += i;\n";
		forloopCText += "\t sum = a;\n";
		forloopC.setText(forloopCText);
		
		TextView forloopIA32 = (TextView) findViewById (R.id.forloopIA32);
		String forloopIA32Text = "IA32: \n";
		forloopIA32Text += "NOTE: a is in %ecx, i is in %ebx, sum is in %eax\n" + "\n";
		forloopIA32Text += "\t andl $0, %ebx \n";
		forloopIA32Text += "\t .loop: \n";
		forloopIA32Text += "\t" + "\t cmp $10, %ebx \n";
		forloopIA32Text += "\t" + "\t je .end \n";
		forloopIA32Text += "\t" + "\t addl %ebx, %ecx \n";
		forloopIA32Text += "\t" + "\t incl %ebx \n";
		forloopIA32Text += "\t" + "\t j .loop \n";
		forloopIA32Text += "\t .end: \n";
		forloopIA32Text += "\t" + "\t movl %ecx, %eax \n";
		forloopIA32.setText(forloopIA32Text);
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ia32_for_loop, menu);
		return true;
	}

}
