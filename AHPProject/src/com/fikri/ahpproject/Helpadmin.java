package com.fikri.ahpproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Helpadmin extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helpadmin);
        Button sign = (Button) findViewById(R.id.balik_admin);
        sign.setOnClickListener(new View.OnClickListener() {
            	public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Adminmenu.class);
                startActivityForResult(myIntent, 0);
                finish();
            }
        });
    }
}