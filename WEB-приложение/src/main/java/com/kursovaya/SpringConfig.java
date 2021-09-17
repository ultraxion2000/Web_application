package com.kursovaya;

import com.kursovaya.product.*;
import com.kursovaya.delivery.*;
import com.kursovaya.invoice.*;
import com.kursovaya.table.*;
import com.kursovaya.chairs.*;
import com.kursovaya.user.*;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydb?useSll=false&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("admin");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        return dataSource;
    }

    @Bean
    public ProductDao getProductDao(){
        return new ProductDao(getJdbcTemplate());
    }

    @Bean
    public ProductService getProductService(){
        return new ProductService();
    }

    @Bean
    public DeliveryDao getDeliveryDao(){
        return new DeliveryDao(getJdbcTemplate());
    }

    @Bean
    public DeliveryService getDeliveryService(){
        return new DeliveryService();
    }

    @Bean
    public InvoiceDao getInvoiceDao(){
        return new InvoiceDao(getJdbcTemplate());
    }

    @Bean
    public InvoiceService getInvoiceService(){
        return new InvoiceService();
    }

    @Bean
    public TableDao getTableDao(){
        return new TableDao(getJdbcTemplate());
    }

    @Bean
    public TableService getTableService(){
        return new TableService();
    }

    @Bean
    public ChairsDao getChairsDao(){
        return new ChairsDao(getJdbcTemplate());
    }

    @Bean
    public ChairsService getChairsService(){
        return new ChairsService();
    }
	@Bean
    public UserDao getUserDao(){
        return new UserDao(getJdbcTemplate());
    }

    @Bean
    public UserService getUserService(){
        return new UserService();
    }
}
