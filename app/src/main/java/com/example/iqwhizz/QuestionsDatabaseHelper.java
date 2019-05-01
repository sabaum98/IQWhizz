package com.example.iqwhizz;

import android.database.sqlite.SQLiteOpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.iqwhizz.Questions;
public class QuestionsDatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "Questions.db";
    private static final String TABLE_QUESTION = "questions";

    private static final String COLUMN_QUESTION_QNUM = "question_qnum";
    private static final String COLUMN_QUESTION_STATEMENT= "user_statement";
    private static final String COLUMN_QUESTION_DIFFICULTY = "user_difficulty";
    private static final String COLUMN_QUESTION_SUBJECT = "user_subject";

    private String CREATE_QUESTION_TABLE = "CREATE TABLE " + TABLE_QUESTION + "("
            + COLUMN_QUESTION_QNUM + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_QUESTION_STATEMENT + " TEXT,"
            + COLUMN_QUESTION_DIFFICULTY + " TEXT," + COLUMN_QUESTION_SUBJECT + " TEXT" + ")";
    private  String DELETE_USER_TABLE =
            "DROP TABLE IF EXISTS " + TABLE_QUESTION;
    public QuestionsDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUESTION_TABLE);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DELETE_USER_TABLE);
        onCreate(db);
    }


}
