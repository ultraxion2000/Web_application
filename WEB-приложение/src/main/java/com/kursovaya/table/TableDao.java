package com.kursovaya.table;

import com.kursovaya.product.Product;
import com.kursovaya.product.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TableDao {

    public final JdbcTemplate jdbcTemplate;


    @Autowired
    public TableDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Table> findAll(){

        String sql = "SELECT * FROM table_delivery";
        return jdbcTemplate.query(sql, new TableMapper());
    }

    public void save(Table table){
        String sql = "INSERT INTO table_delivery(id, table_delivery_id) VALUES (?, ?)";
        jdbcTemplate.update(sql, table.getId(), table.getTableDelivery());
    }

    public Table getById(int id){
        String sql = "SELECT * FROM table_delivery WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new TableMapper(), id);
    }


    public void delete(int id){
        String sql = "DELETE FROM table_delivery WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
