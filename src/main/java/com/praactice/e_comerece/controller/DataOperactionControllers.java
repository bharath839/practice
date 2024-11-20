package com.praactice.e_comerece.controller;


import com.praactice.e_comerece.entity.Categorys;
import com.praactice.e_comerece.entity.TimeStamp;
import com.praactice.e_comerece.service.Bussiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "dataApi")
public class DataOperactionControllers {

    @Autowired
    Bussiness bussiness;


   @PostMapping(value = "create")
    public ResponseEntity<?> createCategory(@RequestBody Categorys categorys){

    Categorys insta=new Categorys();
    insta.setId(categorys.getId());
    insta.setName(categorys.getName());
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


   @GetMapping(value = "nativeQueryAllData")
    public ResponseEntity<?> getCateory(){
       return  ResponseEntity.ok(bussiness.nativeQuery());
   }

   @GetMapping(value = "retraval")
    public ResponseEntity<?> getData(){
       return  ResponseEntity.ok(bussiness.dataRetrival());
   }
   @GetMapping(value = "data/{id}")
    public  ResponseEntity<?> getDataById(@PathVariable Long id){
       return  ResponseEntity.ok(id);
   }



    @GetMapping(value = "data/{id}/{data2}")
    public  ResponseEntity<?> getReqById(@PathVariable Long id ,@PathVariable Long data2){
        List<Long> dat= Arrays.asList(id,data2);
        return  ResponseEntity.ok(dat);
    }


    @GetMapping(value = "dat")
    public  ResponseEntity<?> getReqId(@RequestParam(value ="name" ) String name ){
        return  ResponseEntity.ok(name);
    }

}
