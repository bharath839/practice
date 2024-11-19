package com.praactice.e_comerece.controller;

import com.praactice.e_comerece.entity.Categorys;
import com.praactice.e_comerece.service.Bussiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="api")
public class Ecomerec {
    @Autowired
    Bussiness bussiness;

    String dat="bharath";

    @RequestMapping(value = "get")
    public ResponseEntity<?> demo(){
        return ResponseEntity.badRequest().body(dat);
    }


    @PostMapping(value = "post")
    public  ResponseEntity<?> create(@RequestBody String val){
        if(val.equals("post")){
            return  ResponseEntity.ok(val);
        }
        else{
            return ResponseEntity.badRequest().body("ïnvalid text");
        }

    }

    @PutMapping(value = "put" )
    public  ResponseEntity<?> update(@RequestBody String val){
        if(val.equals("put")){
            dat=val+":::::::kumar";
            return  ResponseEntity.ok(dat);
        }
        else{
            return ResponseEntity.badRequest().body("ïnvalid text");
        }

    }





}
