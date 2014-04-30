package com.example.listactivityexample.mips;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.anim;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MIPSAddresingModes extends ListActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] values = new String[] {"Register","Immediate", "Base", "PC Relative", "Register Direct", "Pseudodirect"};
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
		if (item.equals("Register"))
		{
			startClass("com.example.listactivityexample.mips.RegisterAddressing");
		}
		else if (item.equals("Immediate"))
		{
			startClass("com.example.listactivityexample.mips.ImmediateAddressing");
		}
		else if (item.equals("Base"))
		{
			startClass("com.example.listactivityexample.mips.BaseActivity"); 
		}
		else if (item.equals("PC Relative"))
		{
			startClass("com.example.listactivityexample.mips.PCRelativeAddressing");
		}
		else if (item.equals("Register Direct"))
		{
			startClass("com.example.listactivityexample.mips.RegisterDirectAddressing");
		}
		else if (item.equals("Pseudodirect"))
		{
			startClass("com.example.listactivityexample.mips.PseudodirectAddressing");
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mipsaddresing_modes, menu);
		return true;
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}

}
