package com.fikri.ahpproject;

import android.content.Context;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

class Datahelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME="ahpproject.db";
	private static final int SCHEMA_VERSION=1;
	
	@Override
	public void onCreate(SQLiteDatabase db) {
        final String CREATE_TABLE_identitas =
		"CREATE TABLE identitas (_id INTEGER PRIMARY KEY AUTOINCREMENT, user TEXT, pass TEXT, nama TEXT, jekel TEXT);";
		db.execSQL(CREATE_TABLE_identitas);
		final String CREATE_TABLE_pertanyaan = 
		"CREATE TABLE pertanyaan (_id INTEGER PRIMARY KEY AUTOINCREMENT, soal1 DOUBLE, soal2 DOUBLE, soal3 DOUBLE, soal4 DOUBLE, soal5 DOUBLE, soal6 DOUBLE, soal7 DOUBLE, soal8 DOUBLE, " +
				"soal9 DOUBLE, soal10 DOUBLE, soal11 DOUBLE, soal12 DOUBLE, soal13 DOUBLE, soal14 DOUBLE, soal15 DOUBLE, " +
				"soal16 DOUBLE, soal17 DOUBLE, soal18 DOUBLE, soal19 DOUBLE, soal20 DOUBLE);";
		db.execSQL(CREATE_TABLE_pertanyaan);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		}
	
	public Datahelper(Context context) {
		super(context, DATABASE_NAME, null, SCHEMA_VERSION);
		
	}
	
	public Cursor getAll() {
		return(getReadableDatabase()
						.rawQuery("SELECT _id, user, pass, nama, jekel FROM identitas ORDER BY nama", null));
	}
	
	public Cursor getById(String id) {
		String[] args={id};
		return(getReadableDatabase()
						.rawQuery("SELECT _id, user, pass, nama, jekel FROM identitas WHERE _id=?",
											args));
	}
	
	public void insert(String user, String pass, String nama, 
										 String jekel) {
		ContentValues bv=new ContentValues();
		bv.put("user", user);
		bv.put("pass", pass);
		bv.put("nama", nama);
		bv.put("jekel", jekel);
		getWritableDatabase().insert("identitas", "nama", bv);
	}
	
	public void update(String id, String user, String pass, String nama, String jekel) {
		ContentValues bv=new ContentValues();
		String[] args={id};
		
		bv.put("user", user);
		bv.put("pass", pass);
		bv.put("nama", nama);
		bv.put("jekel", jekel);
	
		getWritableDatabase().update("identitas", bv, "_id=?",
																 args);
	}
	
	public String getSignIn(String user)
	{
			Cursor b = getReadableDatabase().query("identitas", null, "user=?", new String[]{user}, null, null, null);
			if (b.getCount()<1){
				b.close();
				return "not exist";
			}
			b.moveToFirst();
			String password = b.getString(b.getColumnIndex("pass"));
			b.close();
			return password;
	}
	
	public String getUser(Cursor b) {
		return(b.getString(1));
	}
	
	public String getPass(Cursor b) {
		return(b.getString(2));
	}
	
	public String getNama(Cursor b) {
		return(b.getString(3));
	}
	
	public String getJekel(Cursor b) {
		return(b.getString(4));
	}
	
	public Cursor getAll2() {
		return(getReadableDatabase()
						.rawQuery("SELECT _id, soal1, soal2, soal3, soal4, soal5, soal6, soal7, soal8, soal9, soal10, soal11, soal12, soal13, soal14, soal15, soal16, soal17, soal18, soal19, " +
								"soal20 FROM pertanyaan ORDER BY _id",	null));
	}
	
	public Cursor getById2(String id) {
		String[] args={id};
		return(getReadableDatabase()
						.rawQuery("SELECT _id, soal1, soal2, soal3, soal4, soal5, soal6, soal7, soal8, soal9, soal10, soal11, soal12, soal13, soal14, soal15, soal16, soal17, soal18, soal19, soal20 FROM pertanyaan WHERE _id=?",
											args));
	}
	
	public void insert1 (double type, double type2, double type3, double type4, double type5, double type6, double type7,
			double type8, double type9, double type10, double type11, double type12, double type13,
			double type14, double type15, double type16, double type17, double type18, double type19, double type20) {
		ContentValues cv=new ContentValues();
					
		cv.put("soal1", type);
		cv.put("soal2", type2);
		cv.put("soal3", type3);
		cv.put("soal4", type4);
		cv.put("soal5", type5);
		cv.put("soal6", type6);
		cv.put("soal7", type7);
		cv.put("soal8", type8);
		cv.put("soal9", type9);
		cv.put("soal10", type10);
		cv.put("soal11", type11);
		cv.put("soal12", type12);
		cv.put("soal13", type13);
		cv.put("soal14", type14);
		cv.put("soal15", type15);
		cv.put("soal16", type16);
		cv.put("soal17", type17);
		cv.put("soal18", type18);
		cv.put("soal19", type19);
		cv.put("soal20", type20);
		
		getWritableDatabase().insert("pertanyaan", "soal1", cv);
	}
	
	public void update1(String soalId, double type, double type2, double type3, double type4, double type5, double type6, double type7,
			double type8, double type9, double type10, double type11, double type12, double type13,
			double type14, double type15, double type16, double type17, double type18, double type19, double type20) {
		ContentValues cv=new ContentValues();
		String[] args={soalId};
		
		cv.put("soal1", type);
		cv.put("soal2", type2);
		cv.put("soal3", type3);
		cv.put("soal4", type4);
		cv.put("soal5", type5);
		cv.put("soal6", type6);
		cv.put("soal7", type7);
		cv.put("soal8", type8);
		cv.put("soal9", type9);
		cv.put("soal10", type10);
		cv.put("soal11", type11);
		cv.put("soal12", type12);
		cv.put("soal13", type13);
		cv.put("soal14", type14);
		cv.put("soal15", type15);
		cv.put("soal16", type16);
		cv.put("soal17", type17);
		cv.put("soal18", type18);
		cv.put("soal19", type19);
		cv.put("soal20", type20);
		
		getWritableDatabase().update("pertanyaan", cv, "_id=?", args);
	}
	
	public Double getSoal1(Cursor c) {
		return(c.getDouble(1));
	}
	
	public Double getSoal2(Cursor c) {
		return(c.getDouble(2));
	}
	
	public Double getSoal3(Cursor c) {
		return(c.getDouble(3));
	}
	
	public Double getSoal4(Cursor c) {
		return(c.getDouble(4));
	}
	
	public Double getSoal5(Cursor c) {
		return(c.getDouble(5));
	}
	
	public Double getSoal6(Cursor c) {
		return(c.getDouble(6));
	}
	
	public Double getSoal7(Cursor c) {
		return(c.getDouble(7));
	}
	
	public Double getSoal8(Cursor c) {
		return(c.getDouble(8));
	}
	
	public Double getSoal9(Cursor c) {
		return(c.getDouble(9));
	}
	
	public Double getSoal10(Cursor c) {
		return(c.getDouble(10));
	}
	
	public Double getSoal11(Cursor c) {
		return(c.getDouble(11));
	}
	
	public Double getSoal12(Cursor c) {
		return(c.getDouble(12));
	}
	
	public Double getSoal13(Cursor c) {
		return(c.getDouble(13));
	}
	
	public Double getSoal14(Cursor c) {
		return(c.getDouble(14));
	}
	
	public Double getSoal15(Cursor c) {
		return(c.getDouble(15));
	}
	
	public Double getSoal16(Cursor c) {
		return(c.getDouble(16));
	}
	
	public Double getSoal17(Cursor c) {
		return(c.getDouble(17));
	}
	
	public Double getSoal18(Cursor c) {
		return(c.getDouble(18));
	}
	
	public Double getSoal19(Cursor c) {
		return(c.getDouble(19));
	}
	
	public Double getSoal20(Cursor c) {
		return(c.getDouble(20));
	}
}