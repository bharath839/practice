package com.praactice.e_comerece.service;

import com.praactice.e_comerece.entity.Categorys;
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

        return  dataBaseOperations.save(categorys);

    }


}
