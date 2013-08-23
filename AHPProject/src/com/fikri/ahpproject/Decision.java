package com.fikri.ahpproject;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.FloatMath;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Decision extends Activity {
	TextView nama = null;
	TextView total = null;
	TextView kalkulasi = null;
	TextView keputusan = null;
	Button back = null;
	Datahelper helper = null;
	double i1, i2, i3, i4, i5, i6, to, calc;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hasilkerja);
		
		helper = new Datahelper(this);
		
		nama = (TextView)findViewById(R.id.yourname);
		total = (TextView)findViewById(R.id.th);
		kalkulasi = (TextView)findViewById(R.id.hka);
		keputusan = (TextView)findViewById(R.id.keputusan);
		back = (Button)findViewById(R.id.backtouser);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// TODO Auto-generated method stub
				Intent menuuser = new Intent(view.getContext(), Usermenu.class);
				startActivity(menuuser);
			}
		});
		
		Cursor c = helper.getAll2();
		c.moveToLast();
		i1 = helper.getSoal1(c) + helper.getSoal2(c) + helper.getSoal3(c) + helper.getSoal4(c);
		i2 = helper.getSoal5(c) + helper.getSoal6(c) + helper.getSoal7(c);
		i3 = helper.getSoal8(c) + helper.getSoal9(c) + helper.getSoal10(c);
		i4 = helper.getSoal11(c) + helper.getSoal12(c) + helper.getSoal13(c);
		i5 = helper.getSoal14(c) + helper.getSoal15(c) + helper.getSoal16(c) + helper.getSoal17(c);
		i6 = helper.getSoal18(c) + helper.getSoal19(c) + helper.getSoal20(c);
		to = i1 + i2 + i3 + i4 + i5 + i6;
		/*to = helper.getSoal1(c) + helper.getSoal2(c) + helper.getSoal3(c) + helper.getSoal4(c)
				+ helper.getSoal5(c) + helper.getSoal6(c) + helper.getSoal7(c)
				+ helper.getSoal8(c) + helper.getSoal9(c) + helper.getSoal10(c)
				+ helper.getSoal11(c) + helper.getSoal12(c) + helper.getSoal13(c)
				+ helper.getSoal14(c) + helper.getSoal15(c) + helper.getSoal16(c) + helper.getSoal17(c)
				+ helper.getSoal18(c) + helper.getSoal19(c) + helper.getSoal20(c);*/
		calc = ((i1*0.286)+(i2*0.269)+(i3*0.196)+(i4*0.116)+(i5*0.068)+(i6*0.063));
		
		total.setText(Double.toString(to));
		kalkulasi.setText(Double.toString(calc));
		
		if(calc >= 10.045){
			keputusan.setText("ANDA SANGAT SIAP untuk melakukan pembelajaran");
		}
		
		else if(calc >= 6.697){
			keputusan.setText("ANDA SIAP untuk melakukan pembelajaran");
		}
		
		else if(calc >= 3.349){
			keputusan.setText("ANDA KURANG SIAP untuk melakukan pembelajaran");
		}
		
		else if(calc >= 0){
			keputusan.setText("ANDA TIDAK SIAP untuk melakukan pembelajaran");
		}
		
		c.close();
		
	}
	
}
