/*
package com.fikri.ahpproject;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Form5 extends Activity {
	RadioGroup soal14=null;
	RadioGroup soal15=null;
	RadioGroup soal16=null;
	RadioGroup soal17=null;
	Datahelper helper=null;
	String soalId=null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form5);

		helper=new Datahelper(this);
		
		soal14=(RadioGroup)findViewById(R.id.RadioGroup14);
		soal15=(RadioGroup)findViewById(R.id.RadioGroup15);
		soal16=(RadioGroup)findViewById(R.id.RadioGroup16);
		soal17=(RadioGroup)findViewById(R.id.RadioGroup17);
		
		Button save=(Button)findViewById(R.id.save5);
		
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

		if (helper.getSoal14(c).equals(4)) {
			soal14.check(R.id.ssRadio14);
		}
		else if (helper.getSoal14(c).equals(3)) {
			soal14.check(R.id.sRadio14);
		}
		else if (helper.getSoal14(c).equals(2)){
			soal14.check(R.id.ksRadio14);
		}
		
		else helper.getSoal14(c).equals(1); {
			soal14.check(R.id.tsRadio14);
		}
		
		//soal15
		
		if (helper.getSoal15(c).equals(4)) {
			soal15.check(R.id.ssRadio15);
		}
		else if (helper.getSoal15(c).equals(3)) {
			soal15.check(R.id.sRadio15);
		}
		else if (helper.getSoal15(c).equals(2)){
			soal15.check(R.id.ksRadio15);
		}
		
		else helper.getSoal15(c).equals(1); {
			soal15.check(R.id.tsRadio15);
		}
		
		// soal 6
		
		if (helper.getSoal16(c).equals(1)) {
			soal16.check(R.id.ssRadio16);
		}
		else if (helper.getSoal16(c).equals(2)) {
			soal16.check(R.id.sRadio16);
		}
		else if (helper.getSoal16(c).equals(3)){
			soal16.check(R.id.ksRadio16);
		}
		
		else helper.getSoal16(c).equals(4); {
			soal16.check(R.id.tsRadio16);
		}
		
		// soal 7
		
		if (helper.getSoal17(c).equals(4)) {
			soal17.check(R.id.ssRadio17);
		}
		else if (helper.getSoal17(c).equals(3)) {
			soal17.check(R.id.sRadio17);
		}
		else if (helper.getSoal17(c).equals(2)){
			soal17.check(R.id.ksRadio17);
		}
		
		else helper.getSoal17(c).equals(1); {
			soal17.check(R.id.tsRadio17);
		}
		
		c.close();
	}
	
	private View.OnClickListener onSave=new View.OnClickListener() {
		public void onClick(View v) {
			int type14 = 0;
			int type15 = 0;
			int type16 = 0;
			int type17 = 0;
			
			switch (soal14.getCheckedRadioButtonId()) {
			case R.id.ssRadio14:
				type14=4;
				break;
			case R.id.sRadio14:
				type14=3;
				break;
			case R.id.ksRadio14:
				type14=2;
				break;
			case R.id.tsRadio14:
				type14=1;
				break;
		}
			
			switch (soal15.getCheckedRadioButtonId()) {
				case R.id.ssRadio15:
					type15=4;
					break;
				case R.id.sRadio15:
					type15=3;
					break;
				case R.id.ksRadio15:
					type15=2;
					break;
				case R.id.tsRadio15:
					type15=1;
					break;
			}
			
			switch (soal16.getCheckedRadioButtonId()) {
			case R.id.ssRadio16:
				type16=1;
				break;
			case R.id.sRadio16:
				type16=2;
				break;
			case R.id.ksRadio16:
				type16=3;
				break;
			case R.id.tsRadio16:
				type16=4;
				break;
		}
			
			switch (soal17.getCheckedRadioButtonId()) {
			case R.id.ssRadio17:
				type17=4;
				break;
			case R.id.sRadio17:
				type17=3;
				break;
			case R.id.ksRadio17:
				type17=2;
				break;
			case R.id.tsRadio17:
				type17=1;
				break;
		}

			if (soalId==null) {
				helper.insert5(type14, type15, type16, type17);
			}
			else {
				helper.update5(soalId, type14, type15, type16, type17);
			}
			
			finish();
		}
	};
}*/