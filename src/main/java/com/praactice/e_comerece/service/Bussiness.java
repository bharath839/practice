package com.praactice.e_comerece.service;

import com.praactice.e_comerece.entity.Categorys;

import java.util.List;

public interface Bussiness {

    public List<Categorys> getAllCategorys() ;

    public  Categorys create(Categorys categorys);

}
