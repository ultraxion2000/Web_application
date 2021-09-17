package com.kursovaya.chairs;

import com.kursovaya.table.Table;
import com.kursovaya.table.TableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ChairsDao {

    public final JdbcTemplate jdbcTemplate;


    @Autowired
    public ChairsDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Chairs> findAll(){

        String sql = "SELECT * FROM chairs_delivery";
        return jdbcTemplate.query(sql, new ChairsMapper());
    }


    public void save(Chairs chairs){
        String sql = "INSERT INTO chairs_delivery(id, chairs_delivery_id) VALUES (?, ?)";
        jdbcTemplate.update(sql, chairs.getId(), chairs.getChairsDelivery());
    }

    public Chairs getById(int id){
        String sql = "SELECT * FROM chairs_delivery WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new ChairsMapper(), id);
    }


    public void delete(int id){
        String sql = "DELETE FROM chairs_delivery WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
