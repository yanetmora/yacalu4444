package com.edu.utng.modernlogin;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Author: Desarrollo-PC
 */

public class JocDbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Joc.db";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE SopaDeLetras " +
                    "(id integer primary key," +
                    " fecha TEXT, puntuacion integet)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS SopaDeLetras";

    public JocDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
        ContentValues contentValues = new ContentValues();
        contentValues.put("fecha", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
        contentValues.put("puntuacion", 0);
        db.insert("SopaDeLetras", null, contentValues);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }

    public boolean updatePuntuacioSuma (Integer id, String fecha, Integer punts) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("fecha", fecha);
        contentValues.put("puntuacion", punts+getPuntuacio(id));
        db.update("SopaDeLetras", contentValues, "id = ? ", new String[] { Integer.toString(id) } );
        return true;
    }

    public boolean updatePuntuacio (Integer id, String fecha, Integer punts) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("fecha", fecha);
        contentValues.put("puntuacion", punts);
        db.update("SopaDeLetras", contentValues, "id = ? ", new String[] { Integer.toString(id) } );
        return true;
    }

    public long insertPuntuacio (String fecha,Integer punts) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("fecha", fecha);
        contentValues.put("puntuacion", punts);
        return  db.insert("SopaDeLetras", null, contentValues);
    }

    public Integer getPuntuacio(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("select puntuacion from SopaDeLetras where id="+id+"",null);
        System.out.println("Id--------------------->"+id);
        res.moveToFirst();
        System.out.println("Puntuacio--------------------->"+res.getInt(0));
        return res.getInt(0);
    }

    public Object[] getDataPuntuacio(){
        ArrayList<String> fechas = new ArrayList<String>();
        ArrayList<Integer> puntuaciones = new ArrayList<Integer>();

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery(
                "select * from SopaDeLetras order by puntuacion desc limit 7", null );
        res.moveToFirst();

        while(!res.isAfterLast()){
            fechas.add(res.getString(res.getColumnIndex("fecha")));
            puntuaciones.add(res.getInt(res.getColumnIndex("puntuacion")));
            res.moveToNext();
        }
        return new Object[]{fechas,puntuaciones};
    }
}