package com.praactice.e_comerece.service;

import com.praactice.e_comerece.entity.Categorys;
import com.praactice.e_comerece.entity.TimeStamp;

import java.util.List;

public interface Bussiness {

    public List<Categorys> getAllCategorys() ;

    public  Categorys create(Categorys categorys);

    public List<Categorys> nativeQuery();


    public List<TimeStamp> dataRetrival();


}
