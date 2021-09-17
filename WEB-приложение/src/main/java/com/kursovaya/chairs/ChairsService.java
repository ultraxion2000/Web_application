package com.kursovaya.chairs;

import com.kursovaya.table.Table;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ChairsService {

    @Autowired
    ChairsDao chairsDao;

    public List<Chairs> findAll(){
        return chairsDao.findAll();
    }

    public void save(Chairs chairs){
        chairsDao.save(chairs);
    }

    public Chairs getById(int id){
        return chairsDao.getById(id);
    }

    public void delete(int id){
        chairsDao.delete(id);
    }
}
