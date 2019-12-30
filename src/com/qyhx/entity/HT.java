package com.qyhx.entity;

public class HT {
    private int id;
    private String name;
    private String number;
    private String qTime;
    private int khId;
    private int xmId;

    public HT(int id, String name, String number, String qDate, int khId, int xmId) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.qTime = qDate;
        this.khId = khId;
        this.xmId = xmId;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getqTime() {
        return qTime;
    }

    public void setqTime(String qTime) {
        this.qTime = qTime;
    }

    public int getKhId() {
        return khId;
    }

    public void setKhId(int khId) {
        this.khId = khId;
    }

    public int getXmId() {
        return xmId;
    }

    public void setXmId(int xmId) {
        this.xmId = xmId;
    }

    @Override
    public String toString() {
        return String.format("%6d\t%20s\t%15s\t%25s\t%6d\t%6d\n", id, name, number, qTime, khId, xmId);
    }
}
