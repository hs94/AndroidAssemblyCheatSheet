package com.example.listactivityexample.mips;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MIPSFormatList extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_mipsformat_list);
		String[] values = new String[] { "R-type", "I-type", "Jump format"};
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
		if (item.equals("R-type"))
		{
			startClass("com.example.listactivityexample.mips.RtypeClass");
		}
		else if (item.equals("I-type"))
		{
			startClass("com.example.listactivityexample.mips.ItypeClass");
		}
		else if (item.equals("Jump format"))
		{
			startClass("com.example.listactivityexample.mips.JFormatClass");
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
		getMenuInflater().inflate(R.menu.mipsformat_list, menu);
		return true;
	}

}
