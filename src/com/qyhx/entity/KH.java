package com.qyhx.entity;

public class KH {
    private int id;
    private String name;
    private String card;
    private String phone;

    public KH(int id, String name, String card, String phone) {
        this.id = id;
        this.name = name;
        this.card = card;
        this.phone = phone;
    }


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCard() { return card; }

    public void setCard(String card) { this.card = card; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return String.format("%10s\t%10s\t%10s\t%10s\n", id, name, card, phone);
    }
}
