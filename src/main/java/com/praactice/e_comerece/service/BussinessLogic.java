package com.praactice.e_comerece.service;

import com.praactice.e_comerece.entity.Categorys;
import com.praactice.e_comerece.entity.TimeStamp;
import com.praactice.e_comerece.repostory.DataBaseOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BussinessLogic implements  Bussiness {


    @Autowired
    DataBaseOperations dataBaseOperations;


    @Override
    public List<Categorys> getAllCategorys() {

        return    dataBaseOperations.findAll();
    }

    @Override
    public Categorys create(Categorys categorys) {
        TimeStamp timeStamp = new TimeStamp();
        timeStamp.setDate(System.currentTimeMillis()); // Set a valid timestamp (e.g., current time)
        categorys.setTimeStamp(timeStamp);
        return  dataBaseOperations.save(categorys);

    }


}
