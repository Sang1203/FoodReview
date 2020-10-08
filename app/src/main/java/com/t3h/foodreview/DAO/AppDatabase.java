package com.t3h.foodreview.DAO;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public abstract class AppDatabase extends RoomDatabase {
    public static AppDatabase appDatabase;
    public  static AppDatabase getInstance(Context context){
        if(appDatabase == null){
            Room.databaseBuilder(
                    context,
                    AppDatabase.class,
                    "db.user"
            )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return appDatabase;
    }
    public abstract AppDao getAppDao();
}
