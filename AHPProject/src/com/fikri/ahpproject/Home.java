package com.fikri.ahpproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;
import android.content.DialogInterface;
import android.content.Intent;

public class Home extends Activity {
	/** Called when the activity is first created. */
    private int groupId = 1;
    int bantuan = Menu.FIRST;
    int tentang = Menu.FIRST +1;
    int keluar = Menu.FIRST +2;
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Button admin = (Button) findViewById(R.id.buttonadmin);
        admin.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Adminlogin.class);
                startActivity(myIntent);
            }
        });
        
        Button user = (Button) findViewById(R.id.buttonuser);
        user.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Userlogin.class);
                startActivity(myIntent);
            }
        });
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        
    	menu.add(groupId, bantuan, bantuan, "Bantuan").setIcon(R.drawable.ic_action_help);
    	menu.add(groupId, tentang, tentang, "Tentang").setIcon(R.drawable.ic_action_about);
    	menu.add(groupId, keluar, keluar, "Keluar").setIcon(R.drawable.exit);
    	
    	return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
    	switch (item.getItemId()){
    	
    	case 1:
    		Intent a = new Intent(this, Help.class);
    		startActivity(a);
    		return true;
    	
    	case 2:
    		Intent b = new Intent(this, About.class);
    		startActivity(b);
    		return true;
    	
    	case 3:
    		AlertDialog.Builder builder = new AlertDialog.Builder(this);
    		builder.setMessage("Apakah Anda ingin keluar?")
    		.setCancelable(false)
    		.setPositiveButton("Ya",
    		new DialogInterface.OnClickListener() {
    		public void onClick(DialogInterface dialog, int id) {
    			Intent homeIntent = new Intent(Intent.ACTION_MAIN);
    			homeIntent.addCategory(Intent.CATEGORY_HOME);
    			homeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    			startActivity(homeIntent);
    		}
    		}).setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
    		public void onClick(DialogInterface dialog, int id) {
    		dialog.cancel();
    		}
    		}).show();
    	}
    	return super.onOptionsItemSelected(item);
    }
}
