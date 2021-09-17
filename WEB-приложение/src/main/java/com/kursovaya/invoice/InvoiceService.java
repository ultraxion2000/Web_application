package com.kursovaya.invoice;

import com.kursovaya.product.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class InvoiceService {

    @Autowired
    InvoiceDao invoiceDao;

    public List<Invoice> findAll(){
        return invoiceDao.findAll();
    }

    public void save(Invoice invoice){
        invoiceDao.save(invoice);
    }

    public Invoice getById(int productId, int deliveryId){
        return invoiceDao.getById(productId, deliveryId);
    }

    public void update(Invoice invoice){
        invoiceDao.update(invoice);
    }

    public void delete(int productId, int deliveryId){
        invoiceDao.delete(productId, deliveryId);
    }

}
