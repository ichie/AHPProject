package com.fikri.ahpproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Adminlogin extends Activity {
	String pasw ;
	String nama;
	String namaku ="admin";
	String pswd ="admin";
	EditText name;
	EditText pass,tampil;
	
	Intent i;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.adminlogin);
	name = (EditText)findViewById(R.id.username);
	pass = (EditText)findViewById(R.id.password);
	Button submit = (Button)findViewById(R.id.login);
	submit.setOnClickListener(new click());
	i = new Intent(this, Adminmenu.class);
	
	}
	class click implements Button.OnClickListener{
	public void onClick(View v)
	{
		nama = name.getText().toString();
		pasw = pass.getText().toString();
	
		if((pasw.equals(pswd))&&(nama.equals(namaku)))
		{
			Toast.makeText(getApplicationContext(),"Selamat Datang", 19).show();
			startActivity(i);
		}
		else
			Toast.makeText(getApplicationContext(),"Login Anda Salah",19).show();
		}
	}
}