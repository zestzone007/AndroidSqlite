package com.sunseen.androidsqlite

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


// The SQLiteOpenHelper class contains a useful set of APIs
// for managing your database.
class FeedReaderDbHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(FeedReaderContract.SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        //This databasae is only a cache for online data,
        // so its upgrade policy is to simply to discard the data and start over
        db.execSQL(FeedReaderContract.SQL_DELETE_ENTRIES)
        onCreate(db)
    }

    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        onUpgrade(db,oldVersion,newVersion)
    }

    companion object {
        const val DATABASE_NAME = "FeedReader.db"
        const val DATABASE_VERSION = 1
    }

}