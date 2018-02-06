package com.example.soksan.linkwithsolite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Soksan on 26-Sep-17.
 */

public class DatabaseHelper extends SQLiteOpenHelper
{
    public static final String DATABASE_NAME="student.db";
    public static final String TABLE_NAME="student_table";
    public static final String col_1="ID";
    public static final String col_2="NAME";
    public static final String col_3="GENDER";
    public static final String col_4="MARKS";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table "+TABLE_NAME+" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, GENDER TEXT, MARKS INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS"+TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
}
