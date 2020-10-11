package com.t3h.foodreview.Models;

public class TheoDoi {
    private int id;
    private String name;
    private String theodoi;
    private int songuoitheodoi;

    public TheoDoi(int id, String name, String theodoi, int songuoitheodoi) {
        this.id = id;
        this.name = name;
        this.theodoi = theodoi;
        this.songuoitheodoi = songuoitheodoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheodoi() {
        return theodoi;
    }

    public void setTheodoi(String theodoi) {
        this.theodoi = theodoi;
    }

    public int getSonguoitheodoi() {
        return songuoitheodoi;
    }

    public void setSonguoitheodoi(int songuoitheodoi) {
        this.songuoitheodoi = songuoitheodoi;
    }
}
