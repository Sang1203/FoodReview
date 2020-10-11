package com.t3h.foodreview.Models;

public class KhamPha {
    private int id;
    private String tieude;
    private int idUser;
    private String nameUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public KhamPha(int id, String tieude, int idUser, String nameUser) {
        this.id = id;
        this.tieude = tieude;
        this.idUser = idUser;
        this.nameUser = nameUser;
    }
}
