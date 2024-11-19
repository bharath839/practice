package com.praactice.e_comerece.controller;


import com.praactice.e_comerece.entity.Categorys;
import com.praactice.e_comerece.entity.TimeStamp;
import com.praactice.e_comerece.service.Bussiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "dataApi")
public class DataOperactionControllers {

    @Autowired
    Bussiness bussiness;


   @PostMapping(value = "create")
    public ResponseEntity<?> createCategory(@RequestBody Categorys categorys){
//       Date date=new Date();
//       TimeStamp timeStamp =new TimeStamp();
//       timeStamp.setId(categorys.getId());
//       timeStamp.setDate(date.getTime());

    Categorys insta=new Categorys();
    insta.setId(categorys.getId());
    insta.setName(categorys.getName());
//    insta.setTimeStamp(timeStamp);

     bussiness.create(categorys);

       if(insta!=null){
        return ResponseEntity.ok(insta);
}else{
    return ResponseEntity.badRequest().body("data is Not Created");
}
   }

   @GetMapping(value = "getCategory")
    public ResponseEntity<?> getCatagorys(){
       return ResponseEntity.ok(bussiness.getAllCategorys());
   }
}
