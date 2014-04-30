package com.example.listactivityexample.mips;

import com.example.listactivityexample.R;
import com.example.listactivityexample.R.anim;
import com.example.listactivityexample.R.layout;
import com.example.listactivityexample.R.menu;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MIPSAssembly extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] values = new String[] { "Registers", "Instructions", "Instruction Format", "Addressing Modes"};
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
		if (item.equals("Registers"))
		{
			startClass("com.example.listactivityexample.mips.MIPSRegisters");
		}
		else if (item.equals("Instructions"))
		{
			startClass("com.example.listactivityexample.mips.MIPSInstructionsList");
		}
		else if (item.equals("Instruction Format"))
		{
			startClass("com.example.listactivityexample.mips.MIPSFormatList"); 
		}
		else if (item.equals("Addressing Modes"))
		{
			startClass("com.example.listactivityexample.mips.MIPSAddresingModes");
		}
		/*else if (item.equals("Condition Codes"))
		{
			startClass("com.example.listactivityexample.ConditionCodes");
		}
		else if (item.equals("Examples"))
		{
			startClass("com.example.listactivityexample.IA32Examples");
		}*/
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mipsassembly, menu);
		return true;
	}
	
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.left_to_right, R.anim.left_to_right_out);
	}

}
