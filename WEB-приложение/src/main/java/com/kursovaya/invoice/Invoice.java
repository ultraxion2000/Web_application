package com.kursovaya.invoice;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

public class Invoice{


        public int productId;
        public int deliveryId;
        public int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Invoice(){}

    public Invoice(int productId, int deliveryId, int count) {
        this.productId = productId;
        this.deliveryId = deliveryId;
        this.count = count;
    }


}



