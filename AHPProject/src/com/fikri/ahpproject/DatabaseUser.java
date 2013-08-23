package com.fikri.ahpproject;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class DatabaseUser extends ListActivity {
	public final static String ID_EXTRA="ahpproject._ID";
	Cursor model=null;
	AlmagAdapter adapter=null;
	EditText nama=null;
	EditText user=null;
	EditText pass=null;
	RadioGroup jekel=null;
	Datahelper helper=null;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.userlist);
		
		helper=new Datahelper(this);
		
		nama=(EditText)findViewById(R.id.nama);
		user=(EditText)findViewById(R.id.user);
		pass=(EditText)findViewById(R.id.pass);
		jekel=(RadioGroup)findViewById(R.id.jekel);
		
		model=helper.getAll();
		startManagingCursor(model);
		adapter=new AlmagAdapter(model);
		setListAdapter(adapter);
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
		helper.close();
	}
	
	@Override
	public void onListItemClick(ListView list, View view,
															int position, long id) {
		Intent i=new Intent(DatabaseUser.this, Tambahdata.class);

		i.putExtra(ID_EXTRA, String.valueOf(id));
		startActivity(i);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		new MenuInflater(this).inflate(R.menu.menuadd, menu);

		return(super.onCreateOptionsMenu(menu));
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId()==R.id.add) {
			startActivity(new Intent(DatabaseUser.this, Tambahdata.class));
			
			return(true);
		}
		
		return(super.onOptionsItemSelected(item));
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
			
			helper.insert(user.getText().toString(), pass.getText().toString(), nama.getText().toString(),type);
			model.requery();
		}
	};
	
	class AlmagAdapter extends CursorAdapter {
		AlmagAdapter(Cursor b) {
			super(DatabaseUser.this, b);
		}
		
		@Override
		public void bindView(View row, Context ctxt,
												 Cursor b) {
			AlmagHolder holder=(AlmagHolder)row.getTag();
			
			holder.populateFrom(b, helper);
		}
		
		@Override
		public View newView(Context context, Cursor b,
												 ViewGroup parent) {
			LayoutInflater inflater=getLayoutInflater();
			View row=inflater.inflate(R.layout.row, parent, false);
			AlmagHolder holder=new AlmagHolder(row);
			row.setTag(holder);
			
			return(row);
		}
	}
	
	static class AlmagHolder {
		private TextView nama=null;
		private TextView alamat=null;
		private ImageView icon=null;
		private View row=null;
		
		AlmagHolder(View row) {
			this.row=row;
			
			nama=(TextView)row.findViewById(R.id.title);
			icon=(ImageView)row.findViewById(R.id.icon);
		}
		
		void populateFrom(Cursor b, Datahelper helper) {
			nama.setText(helper.getNama(b));
	
			if (helper.getJekel(b).equals("Pria")) {
				icon.setImageResource(R.drawable.pria);
			}
			else if (helper.getJekel(b).equals("Perempuan")) {
				icon.setImageResource(R.drawable.perempuan);
			}
			
		}
	}
}