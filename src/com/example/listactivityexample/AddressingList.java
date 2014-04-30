package com.example.listactivityexample;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.content.Intent;

public class AddressingList extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] modes = new String[] {"Immediate","Normal","Displacement", "Indexed"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, modes);
		setListAdapter(adapter);
	}
	
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		String item = (String) getListAdapter().getItem(position);
		try
		{
			Class mode = Class.forName("com.example.listactivityexample." + item + "Class");
			Intent i = new Intent (AddressingList.this, mode);
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
		getMenuInflater().inflate(R.menu.addressing_list, menu);
		return true;
	}

}
