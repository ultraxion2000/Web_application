package com.kursovaya.delivery;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeliveryMapper implements RowMapper<Delivery> {

    @Override
    public Delivery mapRow(ResultSet resultSet, int i) throws SQLException {
        Delivery delivery = new Delivery();
        delivery.setId(resultSet.getInt("delivery_id"));
        delivery.setDate(resultSet.getInt("date"));
        delivery.setPrice(resultSet.getFloat("delivery_price"));

        return delivery;
    }
}
