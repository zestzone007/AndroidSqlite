package com.sunseen.androidsqlite

import android.provider.BaseColumns

object FeedReaderContract{
    object  FeedEntry: BaseColumns {
        const val TABLE_NAME = "entry"
        const val COLUMN_NAME_TITLE = "title"
        const val COLUMN_NAME_SUBTITLE = "subtitle"
    }

     const val  SQL_CREATE_ENTRIES =
            "CREATE TABLE ${FeedEntry.TABLE_NAME} ("+
                    "${BaseColumns._ID} INTEGER PRIMARY KEY," +
                    "${FeedEntry.COLUMN_NAME_TITLE} TEXT," +
                    "${FeedEntry.COLUMN_NAME_SUBTITLE} TEXT"

     const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXITS ${FeedEntry.TABLE_NAME}"
}