package com.kursovaya.product;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {

    @Autowired
    ProductDao productDao;

    public List<Product> findAll(){
        return productDao.findAll();
    }

    public void save(Product product){
        productDao.save(product);
    }

    public Product getById(int id){
        return productDao.getById(id);
    }

    public void update(Product product){
        productDao.update(product);
    }

    public void delete(int id){
        productDao.delete(id);
    }

}
