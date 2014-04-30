package com.example.listactivityexample.mips;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MIPSAccumulatorList extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] classes = new String[] {"mfhi","mflo"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classes);
		setListAdapter(adapter);
	}
	
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		String item = (String) getListAdapter().getItem(position);
		String instruction = Character.toUpperCase(item.charAt(0)) + item.substring(1);
		try
		{
			Class command = Class.forName("com.example.listactivityexample.mips." + instruction + "Class");
			Intent i = new Intent (MIPSAccumulatorList.this, command);
			startActivity(i);
			overridePendingTransition(R.anim.right_to_left, R.anim.right_to_left_out);
		}
		catch (ClassNotFoundException e)
		{
			Toast.makeText(this, item + " not found", Toast.LENGTH_SHORT).show();
		}
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mipsaccumulator_list, menu);
		return true;
	}

}
