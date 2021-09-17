package com.kursovaya.table;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TableMapper implements RowMapper<Table> {

    @Override
    public Table mapRow(ResultSet resultSet, int i) throws SQLException {
        Table table = new Table();
        table.setId(resultSet.getInt("id"));
        table.setTableDelivery(resultSet.getInt("table_delivery_id"));

        return table;
    }
}
