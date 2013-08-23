package com.fikri.ahpproject;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Usermenu extends Activity {
	
	//Datahelper loginDatabaseAdapter = null;
	Button kerja1 = null;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usermenu);
        kerja1 = (Button) findViewById(R.id.buttonkerja);
        kerja1.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), FormPertanyaan.class);
                startActivity(myIntent);
            }
        });  
        
        Button lihathasil = (Button) findViewById(R.id.buttonlihathasil);
        lihathasil.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Result.class);
                startActivity(myIntent);
            }
        });
        
        Button bantuan = (Button) findViewById(R.id.buttonhelp);
        bantuan.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Helpuser.class);
                startActivity(myIntent);
            }
        });
        
        Button keluar = (Button) findViewById(R.id.usersignout);
        keluar.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Home.class);
                startActivity(myIntent);
            }
        });
    }
}
