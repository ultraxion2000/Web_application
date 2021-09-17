package com.kursovaya.table;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

public class Table{

        public int id;
        public int tableDelivery;


    public Table() {
    }

    public Table(int id, int tableDelivery) {
        this.id = id;
        this.tableDelivery = tableDelivery;
    }

    public int getTableDelivery() {
        return tableDelivery;
    }

    public void setTableDelivery(int tableDelivery) {
        this.tableDelivery = tableDelivery;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}



