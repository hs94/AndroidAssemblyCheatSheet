package com.example.listactivityexample;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ReferenceMainActivity extends ListActivity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] values = new String[] {"IA32 Assembly", "MIPS Assembly"};
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
		if (item.equals("IA32 Assembly"))
			startClass("com.example.listactivityexample.AssemblyReference");
		else if (item.equals("MIPS Assembly"))
			startClass("com.example.listactivityexample.mips.MIPSAssembly");
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.reference_main, menu);
		return true;
	}

}
