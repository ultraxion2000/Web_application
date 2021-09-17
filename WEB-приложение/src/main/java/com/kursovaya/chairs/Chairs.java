package com.kursovaya.chairs;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

public class Chairs{

        public int id;
        public int chairsDelivery;

    public int getChairsDelivery() {
        return chairsDelivery;
    }

    public void setChairsDelivery(int chairsDelivery) {
        this.chairsDelivery = chairsDelivery;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Chairs() {
    }
}



