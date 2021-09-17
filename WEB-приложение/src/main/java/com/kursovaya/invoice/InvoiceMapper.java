package com.kursovaya.invoice;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InvoiceMapper implements RowMapper<Invoice> {

    @Override
    public Invoice mapRow(ResultSet resultSet, int i) throws SQLException {
        Invoice invoice = new Invoice();
        invoice.setProductId(resultSet.getInt("product_product_id"));
        invoice.setDeliveryId(resultSet.getInt("delivery_delivery_id"));
        invoice.setCount(resultSet.getInt("count"));

        return invoice;
    }
}
