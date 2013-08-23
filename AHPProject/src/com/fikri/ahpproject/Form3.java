
/*package com.fikri.ahpproject;



import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Form3 extends Activity {
	RadioGroup soal8=null;
	RadioGroup soal9=null;
	RadioGroup soal10=null;
	Datahelper helper=null;
	String soalId=null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.form3);

		helper=new Datahelper(this);
		
		soal8=(RadioGroup)findViewById(R.id.RadioGroup8);
		soal9=(RadioGroup)findViewById(R.id.RadioGroup9);
		soal10=(RadioGroup)findViewById(R.id.RadioGroup10);
		
		Button save=(Button)findViewById(R.id.save3);
		
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

		if (helper.getSoal8(c).equals(4)) {
			soal8.check(R.id.ssRadio8);
		}
		else if (helper.getSoal8(c).equals(3)) {
			soal8.check(R.id.sRadio8);
		}
		else if (helper.getSoal8(c).equals(2)){
			soal8.check(R.id.ksRadio8);
		}
		
		else helper.getSoal8(c).equals(1); {
			soal8.check(R.id.tsRadio8);
		}
		
		// soal 9
		
		if (helper.getSoal9(c).equals(1)) {
			soal9.check(R.id.ssRadio9);
		}
		else if (helper.getSoal9(c).equals(2)) {
			soal9.check(R.id.sRadio9);
		}
		else if (helper.getSoal9(c).equals(3)){
			soal9.check(R.id.ksRadio9);
		}
		
		else helper.getSoal9(c).equals(4); {
			soal9.check(R.id.tsRadio9);
		}
		
		// soal 10
		
		if (helper.getSoal10(c).equals(4)) {
			soal10.check(R.id.ssRadio10);
		}
		else if (helper.getSoal10(c).equals(3)) {
			soal10.check(R.id.sRadio10);
		}
		else if (helper.getSoal10(c).equals(2)){
			soal10.check(R.id.ksRadio10);
		}
		
		else helper.getSoal10(c).equals(1); {
			soal10.check(R.id.tsRadio10);
		}
		
		c.close();
	}
	
	private View.OnClickListener onSave=new View.OnClickListener() {
		public void onClick(View v) {
			int type8 = 0;
			int type9 = 0;
			int type10 = 0;
			
			switch (soal8.getCheckedRadioButtonId()) {
				case R.id.ssRadio8:
					type8=4;
					break;
				case R.id.sRadio8:
					type8=3;
					break;
				case R.id.ksRadio8:
					type8=2;
					break;
				case R.id.tsRadio8:
					type8=1;
					break;
			}
			
			switch (soal9.getCheckedRadioButtonId()) {
			case R.id.ssRadio9:
				type9=1;
				break;
			case R.id.sRadio9:
				type9=2;
				break;
			case R.id.ksRadio9:
				type9=3;
				break;
			case R.id.tsRadio9:
				type9=4;
				break;
		}
			
			switch (soal10.getCheckedRadioButtonId()) {
			case R.id.ssRadio10:
				type10=4;
				break;
			case R.id.sRadio10:
				type10=3;
				break;
			case R.id.ksRadio10:
				type10=2;
				break;
			case R.id.tsRadio10:
				type10=1;
				break;
		}

			if (soalId==null) {
				helper.insert3(type8, type9, type10);
			}
			else {
				helper.update3(soalId, type8, type9, type10);
			}
			
			finish();
		}
	};
}*/