/*package com.fikri.ahpproject;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Form1 extends Activity {
	RadioGroup soal1=null;
	RadioGroup soal2=null;
	RadioGroup soal3=null;
	RadioGroup soal4=null;
	Datahelper helper=null;
	String soalId=null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form1);

		helper=new Datahelper(this);
		
		soal1=(RadioGroup)findViewById(R.id.RadioGroup1);
		soal2=(RadioGroup)findViewById(R.id.RadioGroup2);
		soal3=(RadioGroup)findViewById(R.id.RadioGroup3);
		soal4=(RadioGroup)findViewById(R.id.RadioGroup4);
		
		Button save=(Button)findViewById(R.id.save);
		
		save.setOnClickListener(onSave);
		
		soalId=getIntent().getStringExtra(DatabaseUser.ID_EXTRA);
		
		/*if (soalId!=null) {
			load();
		}
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	
		helper.close();
	}
	
	/*private void load() {
		Cursor c=helper.getById(soalId);

		c.moveToFirst();		

		if (helper.getSoal1(c).equals(1)) {
			soal1.check(R.id.ssRadio1);
		}
		else if (helper.getSoal1(c).equals(2)) {
			soal1.check(R.id.sRadio1);
		}
		else if (helper.getSoal1(c).equals(3)){
			soal1.check(R.id.ksRadio1);
		}
		
		else helper.getSoal1(c).equals(4); {
			soal1.check(R.id.tsRadio1);
		}
		
		// soal 2
		
		if (helper.getSoal2(c).equals(1)) {
			soal2.check(R.id.ssRadio2);
		}
		else if (helper.getSoal2(c).equals(2)) {
			soal2.check(R.id.sRadio2);
		}
		else if (helper.getSoal2(c).equals(3)){
			soal2.check(R.id.ksRadio2);
		}
		
		else helper.getSoal2(c).equals(4); {
			soal2.check(R.id.tsRadio2);
		}
		
		// soal 3
		
		if (helper.getSoal3(c).equals(4)) {
			soal3.check(R.id.ssRadio3);
		}
		else if (helper.getSoal3(c).equals(3)) {
			soal3.check(R.id.sRadio3);
		}
		else if (helper.getSoal3(c).equals(2)){
			soal3.check(R.id.ksRadio3);
		}
		
		else helper.getSoal3(c).equals(1); {
			soal3.check(R.id.tsRadio3);
		}
		
		// soal 4
		
		if (helper.getSoal4(c).equals(4)) {
			soal4.check(R.id.ssRadio4);
		}
		else if (helper.getSoal4(c).equals(3)) {
			soal4.check(R.id.sRadio4);
		}
		else if (helper.getSoal4(c).equals(2)){
			soal4.check(R.id.ksRadio4);
		}
		
		else helper.getSoal4(c).equals(1); {
			soal4.check(R.id.tsRadio4);
		}
		
		c.close();
	}
	
	private View.OnClickListener onSave=new View.OnClickListener() {
		public void onClick(View v) {
			int type = 0;
			int type2 = 0;
			int type3 = 0;
			int type4 = 0;
			
			switch (soal1.getCheckedRadioButtonId()) {
				case R.id.ssRadio1:
					type=1;
					break;
				case R.id.sRadio1:
					type=2;
					break;
				case R.id.ksRadio1:
					type=3;
					break;
				case R.id.tsRadio1:
					type=4;
					break;
			}
			
			switch (soal2.getCheckedRadioButtonId()) {
			case R.id.ssRadio2:
				type2=1;
				break;
			case R.id.sRadio2:
				type2=2;
				break;
			case R.id.ksRadio2:
				type2=3;
				break;
			case R.id.tsRadio2:
				type2=4;
				break;
		}
			
			switch (soal3.getCheckedRadioButtonId()) {
			case R.id.ssRadio3:
				type3=4;
				break;
			case R.id.sRadio3:
				type3=3;
				break;
			case R.id.ksRadio3:
				type3=2;
				break;
			case R.id.tsRadio3:
				type3=1;
				break;
		}
			
			switch (soal4.getCheckedRadioButtonId()) {
			case R.id.ssRadio4:
				type4=4;
				break;
			case R.id.sRadio4:
				type4=3;
				break;
			case R.id.ksRadio4:
				type4=2;
				break;
			case R.id.tsRadio4:
				type4=1;
				break;
		}

			if (soalId==null) {
				helper.insert1(type, type2, type3, type4);
			}
			else {
				helper.update1(soalId, type, type2, type3, type4);
			}
			
			finish();
		}
	};
}*/