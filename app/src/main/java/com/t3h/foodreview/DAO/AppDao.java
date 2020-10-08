package com.t3h.foodreview.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.t3h.foodreview.Models.User;

import java.util.List;

@Dao
public interface AppDao {
    @Insert
    void insert(User...user);
    @Update
    void update(User...user);
    @Delete
    void delete(User...user);
    @Query("SELECT * FROM User")
    List<User> getUser();
}
