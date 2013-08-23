package com.fikri.ahpproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

	public class Userlogin extends Activity 
	{
		Button btnUser, btnAdmin;
		Datahelper helper = null;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) 
		{
		     super.onCreate(savedInstanceState);
		     setContentView(R.layout.userlogin);
		     
		     
		     // create a instance of SQLite Database
		     helper=new Datahelper(this);

		     // Get The Refference Of Buttons
		     btnUser=(Button)findViewById(R.id.buttonuser);     
		}
		
		
		// Methos to handleClick Event of Sign In Button
		public void signIn(View V)
		   {
				final Dialog dialog = new Dialog(Userlogin.this);
				dialog.setContentView(R.layout.login);
			    dialog.setTitle("Login");
		
			    // get the Refferences of views
			    final  EditText editTextUserName=(EditText)dialog.findViewById(R.id.editTextUserNameToLogin);
			    final  EditText editTextPassword=(EditText)dialog.findViewById(R.id.editTextPasswordToLogin);
			    
				Button btnSignIn=(Button)dialog.findViewById(R.id.buttonSignIn);
					
				// Set On ClickListener
				btnSignIn.setOnClickListener(new View.OnClickListener() {					

					public void onClick(View v) {
						// get The User name and Password
						String user=editTextUserName.getText().toString();
						String password=editTextPassword.getText().toString();

						String storedpass=helper.getSignIn(user);	

						// check if the Stored password matches with  Password entered by user
						if(password.equals(storedpass))
						{
							Toast.makeText(Userlogin.this, "Congrats: Login Successfull", Toast.LENGTH_LONG).show();
							dialog.dismiss();
							startActivity(new Intent(Userlogin.this, Usermenu.class));
						}
						else
						{
							Toast.makeText(Userlogin.this, "User Name or Password does not match", Toast.LENGTH_LONG).show();
						}
					}
				});
				
				dialog.show();
		   }
		
		@Override
		public void onDestroy() {
			super.onDestroy();
		    // Close The Database
			helper.close();
		}
}
