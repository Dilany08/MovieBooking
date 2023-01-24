package com.example.moviebooking;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataManager {

    //Actual Database
    private SQLiteDatabase db;

    //public table to refer to both inside and outside this class
    public static final String TABLE_ROW_ID = "ID";

    public static final String TABLE_ROW_NAME = "name";

    public static final String TABLE_ROW_TITLE = "movieTitle";

    public static final String TABLE_ROW_EMAIL = "EMAIL";

    public static final String TABLE_ROW_PHONENUM = "phoneNum";

    public static final String TABLE_ROW_TIME = "time";

    public static final String TABLE_ROW_AMOUNT = "amount";

    //private table to refer to inside this class
    private static final String DB_NAME = "movieBooking";

    private static final int DB_VERSION = 1;

    private static final String TABLE_INFO = "information";

    //manages database creation and version management
    private class CustomSQLiteOpenHelper extends SQLiteOpenHelper {

        public CustomSQLiteOpenHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        //create table in the database
        @Override
        public void onCreate(SQLiteDatabase db) {
            String newTableQueryString = "create table "
                    + TABLE_INFO + "( "
                    + TABLE_ROW_ID
                    + " integer primary key autoincrement not null,"
                    + TABLE_ROW_NAME +
                    " text not null,"
                    + TABLE_ROW_PHONENUM
                    + " text not null,"
                    + TABLE_ROW_EMAIL
                    + " text not null,"
                    + TABLE_ROW_TITLE
                    + " text not null,"
                    + TABLE_ROW_TIME
                    + " text not null,"
                    + TABLE_ROW_AMOUNT
                    + " text not null);";
            db.execSQL(newTableQueryString);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }

    //Creating the constructor of dm
    public DataManager(Context context) {
        //create instance of internal
        CustomSQLiteOpenHelper helper = new CustomSQLiteOpenHelper(context);
        //get a writable database
        db = helper.getWritableDatabase();
    }

    public void insert(String name, String movieTitle, String EMAIL, String phoneNum, String time, String amount) {

        //inserting data in database
        String query = "INSERT INTO " + TABLE_INFO + " (" +
                TABLE_ROW_NAME + ", " +
                TABLE_ROW_PHONENUM + ", " +
                TABLE_ROW_EMAIL + ", " +
                TABLE_ROW_TITLE + ", " +
                TABLE_ROW_TIME + ", " +
                TABLE_ROW_AMOUNT + ") " +
                "VALUES (" +
                "'" + name + "'" + ", " +
                "'" + phoneNum + "'" + ", " +
                "'" + EMAIL + "'" + ", " +
                "'" + movieTitle + "'" + ", " +
                "'" + time + "'" + ", " +
                "'" + amount + "'" +
                ")";
        Log.i("insert() = ", query);
        db.execSQL(query);

    }

    public String showData(Cursor c) {
        Appdata myData = new Appdata();
        while (c.moveToNext()) {
            Log.i(c.getString(1), c.getString(2));
            myData.setData(c.getString(0), c.getString(1),
                    c.getString(2), c.getString(3),
                    c.getString(4), c.getString(5),
                    c.getString(6));

        }
        return myData.getData();
    }

    public Cursor search(String name) {

        String query = "SELECT " +
                TABLE_ROW_ID + ", " +
                TABLE_ROW_NAME + ", " +
                TABLE_ROW_PHONENUM + ", " +
                TABLE_ROW_EMAIL + ", " +
                TABLE_ROW_TITLE + ", " +
                TABLE_ROW_TIME + ", " +
                TABLE_ROW_AMOUNT + " from " +
                TABLE_INFO + " WHERE " +
                TABLE_ROW_NAME + " = '" + name + "';";
        Log.i("search() = ", query);
        Cursor c = db.rawQuery(query, null);
        return c;

    }

    public Cursor search2(String ID) {

        String query = "SELECT " +
                TABLE_ROW_ID + ", " +
                TABLE_ROW_NAME + ", " +
                TABLE_ROW_PHONENUM + ", " +
                TABLE_ROW_EMAIL + ", " +
                TABLE_ROW_TITLE + ", " +
                TABLE_ROW_TIME + ", " +
                TABLE_ROW_AMOUNT + " from " +
                TABLE_INFO + " WHERE " +
                TABLE_ROW_ID + " = '" + ID + "';";
        Log.i("search() = ", query);
        Cursor c = db.rawQuery(query, null);
        return c;

    }

    public void delete(String _id) {
        String query = "DELETE FROM " + TABLE_INFO +
                " WHERE " + TABLE_ROW_ID +
                " = '" + _id + "';";
        Log.i("delete() = ", query);
        db.execSQL(query);
    }

    public Cursor searchAll() {
        Cursor c = db.rawQuery("SELECT *" + " from " +
                TABLE_INFO, null);
        return c;
    }

    public Appdata editData(Cursor c) {
        Appdata myData = new Appdata();
        while (c.moveToNext()) {
            myData.setName(c.getString(0));
            myData.setPhone(c.getString(1));
            myData.setEmail(c.getString(2));
            myData.setTitle(c.getString(3));
            myData.setTime(c.getString(4));
            myData.setAmount(c.getString(5));
        }
        return myData;
    }

    public void update(String name, String movieTitle, String EMAIL, String phoneNum, String time, String amount, String id) {
        String query = "UPDATE " + TABLE_INFO +
            TABLE_ROW_NAME + " = " +"'" + name + "'" +
            ", " + "SET " +
            TABLE_ROW_NAME + " = " + "'" + name + "'" + ", " +
            TABLE_ROW_PHONENUM + " = " + "'" + phoneNum  + "'" + ", " +
            TABLE_ROW_EMAIL + " = " + "'" + EMAIL  + "'" + ", " +
            TABLE_ROW_TITLE + " = " + "'" + movieTitle  + "'" + ", " +
            TABLE_ROW_TIME + " = " + "'" + time  + "'" + ", " +
            TABLE_ROW_AMOUNT + " = " + "'" + amount + "'" + ", " +
            TABLE_ROW_ID + " = " + "'" + id + "'" +
                "WHERE " + TABLE_ROW_NAME + " = " + "'" + name  + "'" + ", " +
             TABLE_ROW_NAME + " = " +"'" + name  + "'" +
             TABLE_ROW_PHONENUM  + " = " +"'" + phoneNum  + "'" +
             TABLE_ROW_EMAIL  + " = " +"'" + EMAIL  + "'" +
             TABLE_ROW_TITLE  + " = " +"'" + movieTitle  + "'" +
             TABLE_ROW_TIME  + " = " +"'" + time  + "'" +
             TABLE_ROW_AMOUNT  + " = " +"'" + amount  + "'" +
                TABLE_ROW_ID + " = " + "'" + id + "'";
        Log.i("update() = ", query);
        db.execSQL(query);


    }
}


