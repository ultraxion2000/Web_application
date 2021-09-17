package com.kursovaya.delivery;

import java.sql.Date;

public class Delivery{


        public int id;
        public int date;
        public float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Delivery(){
    }

    public Delivery(int id, int date, float price){
            this.id = id;
            this.date = date;
            this.price = price;
        }

    }



