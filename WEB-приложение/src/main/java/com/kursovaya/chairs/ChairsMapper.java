package com.kursovaya.chairs;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ChairsMapper implements RowMapper<Chairs> {

    @Override
    public Chairs mapRow(ResultSet resultSet, int i) throws SQLException {
        Chairs chairs = new Chairs();
        chairs.setId(resultSet.getInt("id"));
        chairs.setChairsDelivery(resultSet.getInt("chairs_delivery_id"));

        return chairs;
    }
}
