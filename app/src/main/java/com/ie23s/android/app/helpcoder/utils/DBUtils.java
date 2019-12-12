package com.ie23s.android.app.helpcoder.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBUtils extends SQLiteOpenHelper {

    public DBUtils(Context context) {
        // конструктор суперкласса
        super(context, "HelpCoderDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // создаем таблицу с полями
        db.execSQL("create table mytable ("
                + "id integer primary key autoincrement,"
                + "name text,"
                + "email text" + ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 10010001:
                /////dddd
            case 10020111:
                //ddddd
            case 10020936:
                ///
        }
    }
}
/*
1. 10010001
2. 10020111
3. 10020936
 */