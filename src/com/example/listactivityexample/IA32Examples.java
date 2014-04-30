package com.example.listactivityexample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class IA32Examples extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_ia32_examples);
		String[] values = new String[] { "Arithmetic", "if/else", "for-loop", "while-loop", "Functions",
				"Recursion", "Calling Other Functions"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);
	}
	
	private void startClass (String className)
	{
		Intent i = new Intent (className);
		startActivity(i);
		overridePendingTransition(R.anim.right_to_left, R.anim.right_to_left_out);
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		String item = (String) getListAdapter().getItem(position);
		if (item.equals("Arithmetic"))
		{
			startClass("com.example.listactivityexample.ia32examples.IA32Arithmetic");
		}
		else if (item.equals("if/else"))
		{
			startClass("com.example.listactivityexample.ia32examples.IA32IfElse");
		}
		else if (item.equals("for-loop"))
		{
			startClass("com.example.listactivityexample.ia32examples.IA32ForLoop");
		}
		else if (item.equals("while-loop"))
		{
			startClass("com.example.listactivityexample.ia32examples.IA32WhileLoop");
		}
		else if (item.equals("Functions"))
		{
			startClass("com.example.listactivityexample.ia32examples.IA32Functions");
		}
		else if (item.equals("Recursion"))
		{
			startClass("com.example.listactivityexample.ia32examples.IA32Recursion");
		}
		else if (item.equals("Calling Other Functions"))
		{
			startClass("com.example.listactivityexample.ia32examples.IA32CallFunctions");
		}
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ia32_examples, menu);
		return true;
	}

}
