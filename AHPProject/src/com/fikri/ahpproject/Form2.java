/*package com.fikri.ahpproject;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Form2 extends Activity {
	RadioGroup soal5=null;
	RadioGroup soal6=null;
	RadioGroup soal7=null;
	Datahelper helper=null;
	String soalId=null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form2);

		helper=new Datahelper(this);
		
		soal5=(RadioGroup)findViewById(R.id.radioGroup5);
		soal6=(RadioGroup)findViewById(R.id.RadioGroup6);
		soal7=(RadioGroup)findViewById(R.id.RadioGroup7);
		
		Button save=(Button)findViewById(R.id.save2);
		
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

		if (helper.getSoal5(c).equals(4)) {
			soal5.check(R.id.ssRadio5);
		}
		else if (helper.getSoal5(c).equals(3)) {
			soal5.check(R.id.sRadio5);
		}
		else if (helper.getSoal5(c).equals(2)){
			soal5.check(R.id.ksRadio5);
		}
		
		else helper.getSoal5(c).equals(1); {
			soal5.check(R.id.tsRadio5);
		}
		
		// soal 6
		
		if (helper.getSoal6(c).equals(1)) {
			soal6.check(R.id.ssRadio6);
		}
		else if (helper.getSoal6(c).equals(2)) {
			soal6.check(R.id.sRadio6);
		}
		else if (helper.getSoal6(c).equals(3)){
			soal6.check(R.id.ksRadio6);
		}
		
		else helper.getSoal6(c).equals(4); {
			soal6.check(R.id.tsRadio6);
		}
		
		// soal 7
		
		if (helper.getSoal7(c).equals(4)) {
			soal7.check(R.id.ssRadio7);
		}
		else if (helper.getSoal7(c).equals(3)) {
			soal7.check(R.id.sRadio7);
		}
		else if (helper.getSoal7(c).equals(2)){
			soal7.check(R.id.ksRadio7);
		}
		
		else helper.getSoal7(c).equals(1); {
			soal7.check(R.id.tsRadio7);
		}
		
		c.close();
	}
	
	private View.OnClickListener onSave=new View.OnClickListener() {
		public void onClick(View v) {
			int type5 = 0;
			int type6 = 0;
			int type7 = 0;
			
			switch (soal5.getCheckedRadioButtonId()) {
				case R.id.ssRadio5:
					type5=4;
					break;
				case R.id.sRadio5:
					type5=3;
					break;
				case R.id.ksRadio5:
					type5=2;
					break;
				case R.id.tsRadio5:
					type5=1;
					break;
			}
			
			switch (soal6.getCheckedRadioButtonId()) {
			case R.id.ssRadio6:
				type6=1;
				break;
			case R.id.sRadio6:
				type6=2;
				break;
			case R.id.ksRadio6:
				type6=3;
				break;
			case R.id.tsRadio6:
				type6=4;
				break;
		}
			
			switch (soal7.getCheckedRadioButtonId()) {
			case R.id.ssRadio7:
				type7=4;
				break;
			case R.id.sRadio7:
				type7=3;
				break;
			case R.id.ksRadio7:
				type7=2;
				break;
			case R.id.tsRadio7:
				type7=1;
				break;
		}

			if (soalId==null) {
				helper.insert2(type5, type6, type7);
			}
			else {
				helper.update2(soalId, type5, type6, type7);
			}
			
			finish();
		}
	};
}*/