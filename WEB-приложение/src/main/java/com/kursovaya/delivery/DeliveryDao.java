package com.kursovaya.delivery;

import com.kursovaya.product.Product;
import com.kursovaya.product.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class DeliveryDao {

    public final JdbcTemplate jdbcTemplate;


    @Autowired
    public DeliveryDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Delivery> findAll(){

        String sql = "SELECT * FROM delivery";
        return jdbcTemplate.query(sql, new DeliveryMapper());
    }

    public void save(Delivery delivery){
        String sql = "INSERT INTO delivery(delivery_id, date, delivery_price) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, delivery.getId(), delivery.getDate(), delivery.getPrice());
    }

    public Delivery getById(int id){
        String sql = "SELECT * FROM delivery WHERE delivery_id = ?";
        return jdbcTemplate.queryForObject(sql, new DeliveryMapper(), id);
    }

    public void update(Delivery delivery){
        String sql = "UPDATE delivery SET date = ?, delivery_price = ? WHERE delivery_id = ?";
        jdbcTemplate.update(sql, delivery.getDate(), delivery.getPrice(), delivery.getId());
    }

    public void delete(int id){
        String sql = "DELETE FROM delivery WHERE delivery_id = ?";
        jdbcTemplate.update(sql, id);
    }
}
