package com.kursovaya.delivery;

import com.kursovaya.product.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeliveryService {

    @Autowired
    DeliveryDao deliveryDao;

    public List<Delivery> findAll(){
        return deliveryDao.findAll();
    }

    public void save(Delivery delivery){
        deliveryDao.save(delivery);
    }

    public Delivery getById(int id){
        return deliveryDao.getById(id);
    }

    public void update(Delivery delivery){
        deliveryDao.update(delivery);
    }

    public void delete(int id){
        deliveryDao.delete(id);
    }

}
