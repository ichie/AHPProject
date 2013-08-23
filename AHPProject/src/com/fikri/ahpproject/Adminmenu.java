package com.fikri.ahpproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adminmenu extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminmenu);
        Button sign = (Button) findViewById(R.id.lihat);
        sign.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), DatabaseQuest.class);
                startActivityForResult(myIntent, 0);
                finish();
            }
        });
        
        Button tambah = (Button) findViewById(R.id.tambah);
        tambah.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), DatabaseUser.class);
                startActivityForResult(myIntent, 0);
                finish();
            }
        });
        
        Button bantuan = (Button) findViewById(R.id.adminhelp);
        bantuan.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Helpadmin.class);
                startActivityForResult(myIntent, 0);
                finish();
            	}
        });
        
        Button keluar = (Button) findViewById(R.id.signoutadmin);
        keluar.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Home.class);
                startActivityForResult(myIntent, 0);
                finish();
            	}
        });
    }
}