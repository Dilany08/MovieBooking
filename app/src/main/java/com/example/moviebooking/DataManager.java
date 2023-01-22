package com.example.moviebooking;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
                    + "integer primary key autoincrement not null,"
                    + TABLE_ROW_PHONENUM
                    + "int not null,"
                    + TABLE_ROW_EMAIL
                    + "text not null,"
                    + TABLE_ROW_TITLE
                    + "text not null,"
                    + TABLE_ROW_TIME
                    + "int not null,"
                    + TABLE_ROW_AMOUNT
                    + "int not null);";
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
}