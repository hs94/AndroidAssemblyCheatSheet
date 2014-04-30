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

public class MIPSInstructionsList extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_mipsinstructions_list);
		
		String [] classes = {"Arithmetic","Shift", "Logical", "Conditional", "Multiply and Divide", 
				"Accumulator Access", "Jumps and Branches", "Load and Store"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classes);
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
			startClass("com.example.listactivityexample.mips.MIPSArithmeticList");
		}
		else if (item.equals("Shift"))
		{
			startClass("com.example.listactivityexample.mips.MIPSShiftList");
		}
		else if (item.equals("Logical"))
		{
			startClass("com.example.listactivityexample.mips.MIPSLogicalList"); 
		}
		else if (item.equals("Conditional"))
		{
			startClass("com.example.listactivityexample.mips.MIPSConditionalList");
		}
		else if (item.equals("Multiply and Divide"))
		{
			startClass("com.example.listactivityexample.mips.MIPSMultiplyDivide");
		}
		else if (item.equals("Accumulator Access"))
		{
			startClass("com.example.listactivityexample.mips.MIPSAccumulatorList");
		}
		else if (item.equals("Jumps and Branches"))
		{
			startClass("com.example.listactivityexample.mips.MIPSJumpList");
		}
		else if (item.equals("Load and Store"))
		{
			startClass("com.example.listactivityexample.mips.MIPSLoadStoreList");
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
		getMenuInflater().inflate(R.menu.mipsinstructions_list, menu);
		return true;
	}

}
