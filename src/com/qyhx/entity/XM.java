package com.qyhx.entity;

public class XM {
    private int id;
    private String name;
    private String number;
    private String sTime;
    private String fTime;
    private float money;

    public XM(int id,String name,String number,String sTime,String fTime,float money){
        this.id = id;
        this.name = name;
        this.number = number;
        this.sTime = sTime;
        this.fTime = fTime;
        this.money = money;
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

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
    }

    public String getfTime() {
        return fTime;
    }

    public void setfTime(String fTime) {
        this.fTime = fTime;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }


    public String toString(){
        return String.format("%6d\t%20d\t%20%\t%20d\t%20d\t%20d\n",id,name,number,sTime,fTime,money);
    }
}

