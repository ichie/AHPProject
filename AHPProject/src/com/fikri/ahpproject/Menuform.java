/*package com.fikri.ahpproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menuform extends Activity{
	//Datahelper loginDatabaseAdapter = null;
	Button kerja1 = null;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kerja);
        kerja1 = (Button) findViewById(R.id.buttonkerja1);
        kerja1.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Form1.class);
                startActivity(myIntent);
            }
        }); 
        
        Button kerja2 = (Button) findViewById(R.id.buttonkerja2);
        kerja2.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Form2.class);
                startActivity(myIntent);
            }
        });
        
        Button kerja3 = (Button) findViewById(R.id.buttonkerja3);
        kerja3.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Form3.class);
                startActivity(myIntent);
            }
        });
        
        Button kerja4 = (Button) findViewById(R.id.buttonkerja4);
        kerja4.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Form4.class);
                startActivity(myIntent);
            }
        });
        
        Button kerja5 = (Button) findViewById(R.id.buttonkerja5);
        kerja5.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Form5.class);
                startActivity(myIntent);
            }
        });
        
        Button kerja6 = (Button) findViewById(R.id.buttonkerja6);
        kerja6.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Form6.class);
                startActivity(myIntent);
            }
        });
	}
}*/