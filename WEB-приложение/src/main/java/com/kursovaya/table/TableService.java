package com.kursovaya.table;

import com.kursovaya.product.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TableService {

    @Autowired
    TableDao tableDao;

    public List<Table> findAll(){
        return tableDao.findAll();
    }

    public void save(Table table){
        tableDao.save(table);
    }

    public Table getById(int id){
        return tableDao.getById(id);
    }

    public void delete(int id){
        tableDao.delete(id);
    }

}
