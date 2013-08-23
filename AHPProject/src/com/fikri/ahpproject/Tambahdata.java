package com.fikri.ahpproject;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Tambahdata extends Activity {
	EditText nama=null;
	EditText alamat=null;
	EditText hp=null;
	EditText user=null;
	EditText pass=null;
	RadioGroup jekel=null;
	Datahelper helper=null;
	String almagId=null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detailform);

		helper=new Datahelper(this);
		
		user=(EditText)findViewById(R.id.user);
		pass=(EditText)findViewById(R.id.pass);
		nama=(EditText)findViewById(R.id.nama);
		jekel=(RadioGroup)findViewById(R.id.jekel);
		
		Button save=(Button)findViewById(R.id.save);
		save.setOnClickListener(onSave);
		
		almagId=getIntent().getStringExtra(DatabaseUser.ID_EXTRA);
		
		if (almagId!=null) {
			load();
		}
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	
		helper.close();
	}
	
	private void load() {
		Cursor b=helper.getById(almagId);

		b.moveToFirst();		
		user.setText(helper.getUser(b));
		pass.setText(helper.getPass(b));
		nama.setText(helper.getNama(b));
		
		
		if (helper.getJekel(b).equals("Pria")) {
			jekel.check(R.id.pria);
		}
		else if (helper.getJekel(b).equals("Perempuan")) {
			jekel.check(R.id.perempuan);
		}
		
		b.close();
	}
	
	private View.OnClickListener onSave=new View.OnClickListener() {
		public void onClick(View v) {
			String type=null;
			
			switch (jekel.getCheckedRadioButtonId()) {
				case R.id.pria:
					type="Pria";
					break;
				case R.id.perempuan:
					type="Perempuan";
					break;
				
			}

			if (almagId==null) {
				helper.insert(user.getText().toString(),
						pass.getText().toString(), nama.getText().toString(),type);
			}
			else {
				helper.update(almagId, user.getText().toString(), 
						pass.getText().toString(), nama.getText().toString(), type);
			}
			
			finish();
		}
	};
}
