package com.fikri.ahpproject;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.SyncStateContract.Helpers;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class DatabaseQuest extends ListActivity {
	public final static String ID_EXTRA="ahpproject._ID";
	Cursor model=null;
	SoalAdapter adapter=null;
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
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
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
		
		model=helper.getAll2();
		startManagingCursor(model);
		adapter=new SoalAdapter(model);
		setListAdapter(adapter);
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
		helper.close();
	}
	
	public void onListItemClick(ListView list, View view,
															int position, long id) {
		Intent i=new Intent(DatabaseQuest.this, DatabaseQuest.class);

		i.putExtra(ID_EXTRA, String.valueOf(id));
		startActivity(i);
	}
	
	class SoalAdapter extends CursorAdapter {
		SoalAdapter(Cursor c) {
			super(DatabaseQuest.this, c);
		}
		
		@Override
		public void bindView(View row, Context ctxt, Cursor c) {
			SoalHolder holder=(SoalHolder)row.getTag();
			
			holder.populateFrom2(c, helper);
		}
		
		@Override
		public View newView(Context ctxt, Cursor c,
												 ViewGroup parent) {
			LayoutInflater inflater=getLayoutInflater();
			View row=inflater.inflate(R.layout.row2, parent, false);
			SoalHolder holder=new SoalHolder(row);
			
			row.setTag(holder);
			
			return(row);
		}
	}
	
	static class SoalHolder {
		private TextView nilai = null;
		private TextView judul = null;
		private View row=null;
		
		SoalHolder(View row) {
			this.row=row;
			
			judul=(TextView)row.findViewById(R.id.title);
			nilai=(TextView)row.findViewById(R.id.nilai);
			
		}
		
		void populateFrom2(Cursor c, Datahelper helper){
				judul.setText("Hasil total kalkulasi");
				nilai.setText(Double.toString(helper.getSoal1(c) + helper.getSoal2(c) + helper.getSoal3(c) + helper.getSoal4(c)
						+ helper.getSoal5(c) + helper.getSoal6(c) + helper.getSoal7(c)
						+ helper.getSoal8(c) + helper.getSoal9(c) + helper.getSoal10(c)
						+ helper.getSoal11(c) + helper.getSoal12(c) + helper.getSoal13(c)
						+ helper.getSoal14(c) + helper.getSoal15(c) + helper.getSoal16(c) + helper.getSoal17(c)
						+ helper.getSoal18(c) + helper.getSoal19(c) + helper.getSoal20(c)));
		}
	}
}
