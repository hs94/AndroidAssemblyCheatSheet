package com.example.listactivityexample.ia32examples;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class IA32CallFunctions extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ia32_call_functions);
		
		String otherfunctionC = "C: \n";
		otherfunctionC += "int course1 = 15213; \n";
		otherfunctionC += "int course2 = 18223; \n";
		otherfunctionC += "void call_swap() {  \n";
		otherfunctionC += "\t swap(&course1, &course2); \n" + "} \n";
		
		String otherfunctionIA32 = "IA32: \n";
		otherfunctionIA32 += "# for swap code, see functions example \n";
		otherfunctionIA32 += "call_swap: \n";
		otherfunctionIA32 += "\t movl $15213, %ebx \n";
		otherfunctionIA32 += "\t movl $18223, %ecx \n";
		otherfunctionIA32 += "\t subl $24, %esp \n";
		otherfunctionIA32 += "\t movl  %ebx, 4(%esp) \n";
		otherfunctionIA32 += "\t movl  %ecx, (%esp)  \n";
		otherfunctionIA32 += "\t call swap \n";
		
		TextView callOthersC = (TextView) findViewById (R.id.callothersC);
		TextView callOthersIA32 = (TextView) findViewById (R.id.callothersIA32);
		callOthersC.setText(otherfunctionC);
		callOthersIA32.setText(otherfunctionIA32);

	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ia32_call_functions, menu);
		return true;
	}

}
