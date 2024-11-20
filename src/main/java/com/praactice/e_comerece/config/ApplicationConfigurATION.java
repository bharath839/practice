package com.praactice.e_comerece.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigurATION {

    @Bean
    public String dataPrinting(){
        System.err.println("::::::::::::::Bean Working Fine:::::::::::::::::::");
        return "data";
    }



}
