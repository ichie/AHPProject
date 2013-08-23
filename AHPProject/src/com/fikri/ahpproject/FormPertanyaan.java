package com.fikri.ahpproject;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class FormPertanyaan extends Activity {
	RadioGroup soal1=null;
	RadioGroup soal2=null;
	RadioGroup soal3=null;
	RadioGroup soal4=null;
	RadioGroup soal5=null;
	RadioGroup soal6=null;
	RadioGroup soal7=null;
	RadioGroup soal8=null;
	RadioGroup soal9=null;
	RadioGroup soal10=null;
	RadioGroup soal11=null;
	RadioGroup soal12=null;
	RadioGroup soal13=null;
	RadioGroup soal14=null;
	RadioGroup soal15=null;
	RadioGroup soal16=null;
	RadioGroup soal17=null;
	RadioGroup soal18=null;
	RadioGroup soal19=null;
	RadioGroup soal20=null;
	
	Datahelper helper=null;
	String soalId=null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.formpertanyaan);

		helper=new Datahelper(this);
		
		soal1=(RadioGroup)findViewById(R.id.RadioGroup1);
		soal2=(RadioGroup)findViewById(R.id.RadioGroup2);
		soal3=(RadioGroup)findViewById(R.id.RadioGroup3);
		soal4=(RadioGroup)findViewById(R.id.RadioGroup4);
		soal5=(RadioGroup)findViewById(R.id.radioGroup5);
		soal6=(RadioGroup)findViewById(R.id.RadioGroup6);
		soal7=(RadioGroup)findViewById(R.id.RadioGroup7);
		soal8=(RadioGroup)findViewById(R.id.RadioGroup8);
		soal9=(RadioGroup)findViewById(R.id.RadioGroup9);
		soal10=(RadioGroup)findViewById(R.id.RadioGroup10);
		soal11=(RadioGroup)findViewById(R.id.RadioGroup11);
		soal12=(RadioGroup)findViewById(R.id.RadioGroup12);
		soal13=(RadioGroup)findViewById(R.id.RadioGroup13);
		soal14=(RadioGroup)findViewById(R.id.RadioGroup14);
		soal15=(RadioGroup)findViewById(R.id.RadioGroup15);
		soal16=(RadioGroup)findViewById(R.id.RadioGroup16);
		soal17=(RadioGroup)findViewById(R.id.RadioGroup17);
		soal18=(RadioGroup)findViewById(R.id.RadioGroup18);
		soal19=(RadioGroup)findViewById(R.id.RadioGroup19);
		soal20=(RadioGroup)findViewById(R.id.RadioGroup20);
		
		Button save=(Button)findViewById(R.id.save);
		save.setOnClickListener(onSave);
		soalId=getIntent().getStringExtra(DatabaseUser.ID_EXTRA);
		
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		helper.close();
	}
	
	private View.OnClickListener onSave=new View.OnClickListener() {
		public void onClick(View v) {
			double type = 0;
			double type2 = 0;
			double type3 = 0;
			double type4 = 0;
			double type5 = 0;
			double type6 = 0;
			double type7 = 0;
			double type8 = 0;
			double type9 = 0;
			double type10 = 0;
			double type11 = 0;
			double type12 = 0;
			double type13 = 0;
			double type14 = 0;
			double type15 = 0;
			double type16 = 0;
			double type17 = 0;
			double type18 = 0;
			double type19 = 0;
			double type20 = 0;
			
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
				helper.insert1(type, type2, type3, type4, type5, 
						type6, type7, type8, type9, type10, 
						type11, type12, type13, type14, type15, 
						type16, type17, type18, type19, type20);
			}
			else {
				helper.update1(soalId, type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20);
			}
			
			finish();
		}
	};
}