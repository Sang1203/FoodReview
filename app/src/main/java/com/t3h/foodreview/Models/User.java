package com.t3h.foodreview.Models;

public class User {
    private int id;
    private String email;
    private String password;
    private String name;
    private int sobaiviet,songuoitheodoi,dangtheodoi;

    public User(int id, String email, String password, String name, int sobaiviet, int songuoitheodoi, int dangtheodoi) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.sobaiviet = sobaiviet;
        this.songuoitheodoi = songuoitheodoi;
        this.dangtheodoi = dangtheodoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSobaiviet() {
        return sobaiviet;
    }

    public void setSobaiviet(int sobaiviet) {
        this.sobaiviet = sobaiviet;
    }

    public int getSonguoitheodoi() {
        return songuoitheodoi;
    }

    public void setSonguoitheodoi(int songuoitheodoi) {
        this.songuoitheodoi = songuoitheodoi;
    }

    public int getDangtheodoi() {
        return dangtheodoi;
    }

    public void setDangtheodoi(int dangtheodoi) {
        this.dangtheodoi = dangtheodoi;
    }
}
