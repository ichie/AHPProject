/*
package com.fikri.ahpproject;



import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Form6 extends Activity {
	RadioGroup soal18=null;
	RadioGroup soal19=null;
	RadioGroup soal20=null;
	Datahelper helper=null;
	String soalId=null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form6);

		helper=new Datahelper(this);
		
		soal18=(RadioGroup)findViewById(R.id.RadioGroup18);
		soal19=(RadioGroup)findViewById(R.id.RadioGroup19);
		soal20=(RadioGroup)findViewById(R.id.RadioGroup20);
		
		Button save=(Button)findViewById(R.id.save6);
		
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

		if (helper.getSoal18(c).equals(4)) {
			soal18.check(R.id.ssRadio18);
		}
		else if (helper.getSoal18(c).equals(3)) {
			soal18.check(R.id.sRadio18);
		}
		else if (helper.getSoal18(c).equals(2)){
			soal18.check(R.id.ksRadio18);
		}
		
		else helper.getSoal18(c).equals(1); {
			soal18.check(R.id.tsRadio18);
		}
		
		// soal 6
		
		if (helper.getSoal19(c).equals(1)) {
			soal19.check(R.id.ssRadio19);
		}
		else if (helper.getSoal19(c).equals(2)) {
			soal19.check(R.id.sRadio19);
		}
		else if (helper.getSoal19(c).equals(3)){
			soal19.check(R.id.ksRadio19);
		}
		
		else helper.getSoal19(c).equals(4); {
			soal19.check(R.id.tsRadio19);
		}
		
		// soal 7
		
		if (helper.getSoal20(c).equals(4)) {
			soal20.check(R.id.ssRadio20);
		}
		else if (helper.getSoal20(c).equals(3)) {
			soal20.check(R.id.sRadio20);
		}
		else if (helper.getSoal20(c).equals(2)){
			soal20.check(R.id.ksRadio20);
		}
		
		else helper.getSoal20(c).equals(1); {
			soal20.check(R.id.tsRadio20);
		}
		
		c.close();
	}
	
	private View.OnClickListener onSave=new View.OnClickListener() {
		public void onClick(View v) {
			int type18 = 0;
			int type19 = 0;
			int type20 = 0;
			
			switch (soal18.getCheckedRadioButtonId()) {
				case R.id.ssRadio18:
					type18=4;
					break;
				case R.id.sRadio18:
					type18=3;
					break;
				case R.id.ksRadio18:
					type18=2;
					break;
				case R.id.tsRadio18:
					type18=1;
					break;
			}
			
			switch (soal19.getCheckedRadioButtonId()) {
			case R.id.ssRadio19:
				type19=1;
				break;
			case R.id.sRadio19:
				type19=2;
				break;
			case R.id.ksRadio19:
				type19=3;
				break;
			case R.id.tsRadio19:
				type19=4;
				break;
		}
			
			switch (soal20.getCheckedRadioButtonId()) {
			case R.id.ssRadio20:
				type20=4;
				break;
			case R.id.sRadio20:
				type20=3;
				break;
			case R.id.ksRadio20:
				type20=2;
				break;
			case R.id.tsRadio20:
				type20=1;
				break;
		}

			if (soalId==null) {
				helper.insert6(type18, type19, type20);
			}
			else {
				helper.update6(soalId, type18, type19, type20);
			}
			
			finish();
		}
	};
}*/