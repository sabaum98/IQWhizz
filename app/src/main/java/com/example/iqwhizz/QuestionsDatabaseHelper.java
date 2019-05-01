package com.example.iqwhizz;

import android.database.sqlite.SQLiteOpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.iqwhizz.Question;
public class QuestionsDatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "Questions.db";
    private static final String TABLE_QUESTION = "questions";

    private static final String COLUMN_QUESTION_QNUM = "question_qnum";
    private static final String COLUMN_QUESTION_STATEMENT= "question_statement";
    private static final String COLUMN_QUESTION_DIFFICULTY = "question_difficulty";
    private static final String COLUMN_QUESTION_SUBJECT = "question_subject";

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
    public void addQuestion(Question question) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUMN_QUESTION_STATEMENT, question.getStatement());
        values.put(COLUMN_QUESTION_DIFFICULTY, question.getDifficulty());
        values.put(COLUMN_QUESTION_SUBJECT, question.getSubject());

        // Inserting Row
        db.insert(TABLE_QUESTION, null, values);
        db.close();
    }


}
