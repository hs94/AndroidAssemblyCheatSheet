package com.example.listactivityexample;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;

public class AssemblyReference extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] values = new String[] { "Registers", "Commands", "Addressing Modes", "Instruction Suffixes", "Condition Codes"
				};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);
	}
	
	private void startClass (String className)
	{
		Intent i = new Intent (className);
		startActivity(i);
		overridePendingTransition(R.anim.right_to_left, R.anim.right_to_left_out);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		String item = (String) getListAdapter().getItem(position);
		if (item.equals("Registers"))
		{
			startClass("com.example.listactivityexample.RegistersList");
		}
		else if (item.equals("Commands"))
		{
			startClass("com.example.listactivityexample.CommandsList");
		}
		else if (item.equals("Addressing Modes"))
		{
			startClass("com.example.listactivityexample.AddressingList"); 
		}
		else if (item.equals("Instruction Suffixes"))
		{
			startClass("com.example.listactivityexample.InstructionSuffixes");
		}
		else if (item.equals("Condition Codes"))
		{
			startClass("com.example.listactivityexample.ConditionCodes");
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
		getMenuInflater().inflate(R.menu.listview_example, menu);
		return true;
	}

}
