package com.fikri.ahpproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends Activity {
	TextView b1 = null;
	TextView b2 = null;
	TextView b3 = null;
	TextView b4 = null;
	TextView b5 = null;
	TextView b6 = null;
	Datahelper helper = null;
	Button next = null;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hasil);
		
		helper = new Datahelper(this);
		
		b1=(TextView)findViewById(R.id.hkbag1);
		b2=(TextView)findViewById(R.id.hkbag2);
		b3=(TextView)findViewById(R.id.hkbag3);
		b4=(TextView)findViewById(R.id.hkbag4);
		b5=(TextView)findViewById(R.id.hkbag5);
		b6=(TextView)findViewById(R.id.hkbag6);
		
		next=(Button)findViewById(R.id.selanjutnya);
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				Intent next = new Intent(view.getContext(), Decision.class);
				startActivity(next);
			}
		});
		
		Cursor c = helper.getAll2();
		c.moveToLast();
			b1.setText(Double.toString(helper.getSoal1(c) + helper.getSoal2(c) + helper.getSoal3(c) + helper.getSoal4(c)));
			b2.setText(Double.toString(helper.getSoal5(c) + helper.getSoal6(c) + helper.getSoal7(c)));
			b3.setText(Double.toString(helper.getSoal8(c) + helper.getSoal9(c) + helper.getSoal10(c)));
			b4.setText(Double.toString(helper.getSoal11(c) + helper.getSoal12(c) + helper.getSoal13(c)));
			b5.setText(Double.toString(helper.getSoal14(c) + helper.getSoal15(c) + helper.getSoal16(c) + helper.getSoal17(c)));
			b6.setText(Double.toString(helper.getSoal18(c) + helper.getSoal19(c) + helper.getSoal20(c)));
		c.close();
	}
	
	@Override
	public void onDestroy(){
		super.onDestroy();
		helper.close();
	}
}
