package com.kursovaya.product;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt("product_id"));
        product.setName(resultSet.getString("name"));
        product.setPrice(resultSet.getFloat("product_price"));

        return product;
    }
}
