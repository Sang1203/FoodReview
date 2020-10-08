package com.t3h.foodreview.Models;

import java.util.Date;

public class Post {
    private int id;
    private String mieuta;
    private Date ngaydang;

    public Post() {
    }

    public Post(int id, String mieuta, Date ngaydang) {
        this.id = id;
        this.mieuta = mieuta;
        this.ngaydang = ngaydang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMieuta() {
        return mieuta;
    }

    public void setMieuta(String mieuta) {
        this.mieuta = mieuta;
    }

    public Date getNgaydang() {
        return ngaydang;
    }

    public void setNgaydang(Date ngaydang) {
        this.ngaydang = ngaydang;
    }
}
