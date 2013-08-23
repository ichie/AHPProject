/*
package com.fikri.ahpproject;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Form4 extends Activity {
	RadioGroup soal11=null;
	RadioGroup soal12=null;
	RadioGroup soal13=null;
	Datahelper helper=null;
	String soalId=null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form4);

		helper=new Datahelper(this);
		
		soal11=(RadioGroup)findViewById(R.id.RadioGroup11);
		soal12=(RadioGroup)findViewById(R.id.RadioGroup12);
		soal13=(RadioGroup)findViewById(R.id.RadioGroup13);
		
		Button save=(Button)findViewById(R.id.save4);
		
		save.setOnClickListener(onSave);
		
		soalId=getIntent().getStringExtra(DatabaseUser.ID_EXTRA);
		
		if (soalId!=null) {
			load();
		}
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	
		helper.close();
	}
	
	private void load() {
		Cursor c=helper.getById(soalId);

		c.moveToFirst();		

		if (helper.getSoal11(c).equals(4)) {
			soal11.check(R.id.ssRadio11);
		}
		else if (helper.getSoal11(c).equals(3)) {
			soal11.check(R.id.sRadio11);
		}
		else if (helper.getSoal11(c).equals(2)){
			soal11.check(R.id.ksRadio11);
		}
		
		else helper.getSoal11(c).equals(1); {
			soal11.check(R.id.tsRadio11);
		}
		
		// soal 12
		
		if (helper.getSoal12(c).equals(1)) {
			soal12.check(R.id.ssRadio12);
		}
		else if (helper.getSoal12(c).equals(2)) {
			soal12.check(R.id.sRadio12);
		}
		else if (helper.getSoal12(c).equals(3)){
			soal12.check(R.id.ksRadio12);
		}
		
		else helper.getSoal12(c).equals(4); {
			soal12.check(R.id.tsRadio12);
		}
		
		// soal 13
		
		if (helper.getSoal13(c).equals(4)) {
			soal13.check(R.id.ssRadio13);
		}
		else if (helper.getSoal13(c).equals(3)) {
			soal13.check(R.id.sRadio13);
		}
		else if (helper.getSoal13(c).equals(2)){
			soal13.check(R.id.ksRadio13);
		}
		
		else helper.getSoal13(c).equals(1); {
			soal13.check(R.id.tsRadio13);
		}
		
		c.close();
	}
	
	private View.OnClickListener onSave=new View.OnClickListener() {
		public void onClick(View v) {
			int type11 = 0;
			int type12 = 0;
			int type13 = 0;
			
			switch (soal11.getCheckedRadioButtonId()) {
				case R.id.ssRadio11:
					type11=4;
					break;
				case R.id.sRadio11:
					type11=3;
					break;
				case R.id.ksRadio11:
					type11=2;
					break;
				case R.id.tsRadio11:
					type11=1;
					break;
			}
			
			switch (soal12.getCheckedRadioButtonId()) {
			case R.id.ssRadio12:
				type12=1;
				break;
			case R.id.sRadio12:
				type12=2;
				break;
			case R.id.ksRadio12:
				type12=3;
				break;
			case R.id.tsRadio12:
				type12=4;
				break;
		}
			
			switch (soal13.getCheckedRadioButtonId()) {
			case R.id.ssRadio13:
				type13=4;
				break;
			case R.id.sRadio13:
				type13=3;
				break;
			case R.id.ksRadio13:
				type13=2;
				break;
			case R.id.tsRadio13:
				type13=1;
				break;
		}

			if (soalId==null) {
				helper.insert4(type11, type12, type13);
			}
			else {
				helper.update4(soalId, type11, type12, type13);
			}
			
			finish();
		}
	};
}*/