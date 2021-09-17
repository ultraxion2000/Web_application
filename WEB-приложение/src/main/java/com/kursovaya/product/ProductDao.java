package com.kursovaya.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProductDao {

    public final JdbcTemplate jdbcTemplate;


    @Autowired
    public ProductDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Product> findAll(){

        String sql = "SELECT * FROM product";
        return jdbcTemplate.query(sql, new ProductMapper());
    }

    public void save(Product product){
        String sql = "INSERT INTO product(product_id, name, product_price) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, product.getId(), product.getName(), product.getPrice());
    }

    public Product getById(int id){
        String sql = "SELECT * FROM product WHERE product_id = ?";
        return jdbcTemplate.queryForObject(sql, new ProductMapper(), id);
    }

    public void update(Product product){
        String sql = "UPDATE product SET name = ?, product_price = ? WHERE product_id = ?";
        jdbcTemplate.update(sql, product.getName(), product.getPrice(), product.getId());
    }

    public void delete(int id){
        String sql = "DELETE FROM product WHERE product_id = ?";
        jdbcTemplate.update(sql, id);
    }
}
