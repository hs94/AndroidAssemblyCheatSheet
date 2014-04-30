package com.example.listactivityexample.ia32examples;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class IA32WhileLoop extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ia32_while_loop);
		
		String whileCText = "C: \n";
		whileCText += "\t int result = 1; \n";
		whileCText += "\t while (x > 1) { \n";
		whileCText += "\t" + "\t result *= x; \n";
		whileCText += "\t" + "\t x--; \n";
		whileCText += "\t } \n";
		
		String whileIA32Text = "IA32: \n";
		whileIA32Text += "# x is in %ecx, result is in %eax" + "\n";
		whileIA32Text += "\t movl $1, %eax \n";
		whileIA32Text += "\t jmp .compare \n";
		whileIA32Text += ".loop: \n";
		whileIA32Text += "\t imull %ecx, %eax \n";
		whileIA32Text += "\t decl %ecx \n";
		whileIA32Text += ".compare: \n";
		whileIA32Text += "\t cmp $1, %ecx \n";
		whileIA32Text += "\t jg .loop \n";
		
		TextView whileC = (TextView) findViewById (R.id.whileC);
		whileC.setText(whileCText);
		
		TextView whileIA32 = (TextView) findViewById (R.id.whileIA32);
		whileIA32.setText(whileIA32Text);
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ia32_while_loop, menu);
		return true;
	}

}
