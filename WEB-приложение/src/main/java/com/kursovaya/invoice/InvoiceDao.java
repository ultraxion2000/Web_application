package com.kursovaya.invoice;

import com.kursovaya.product.Product;
import com.kursovaya.product.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class InvoiceDao {

    public final JdbcTemplate jdbcTemplate;


    @Autowired
    public InvoiceDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Invoice> findAll(){

        String sql = "SELECT * FROM invoice";
        return jdbcTemplate.query(sql, new InvoiceMapper());
    }

    public void save(Invoice invoice){
        String sql = "INSERT INTO invoice(product_product_id, delivery_delivery_id, count) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, invoice.getProductId(), invoice.getDeliveryId(), invoice.getCount());
    }

    public Invoice getById(int productId, int deliveryId){
        String sql = "SELECT * FROM invoice WHERE product_product_id = ? AND delivery_delivery_id = ?";
        return jdbcTemplate.queryForObject(sql, new InvoiceMapper(), productId, deliveryId);
    }

    public void update(Invoice invoice){
        String sql = "UPDATE invoice SET count = ? WHERE product_product_id = ? AND delivery_delivery_id = ?";
        jdbcTemplate.update(sql, invoice.getCount(), invoice.getProductId(), invoice.getDeliveryId());
    }

    public void delete(int productId, int deliveryId){
        String sql = "DELETE FROM invoice WHERE product_product_id = ? AND delivery_delivery_id = ?";
        jdbcTemplate.update(sql, productId, deliveryId);
    }
}
