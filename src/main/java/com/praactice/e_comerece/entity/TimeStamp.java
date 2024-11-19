package com.praactice.e_comerece.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;

@Entity
public class TimeStamp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generate ID
    private Long id;

    private Long date;  // You can consider changing this to Date or Instant if you like

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    // Optionally, add a constructor to initialize date:
    public TimeStamp() {
        this.date = System.currentTimeMillis();  // current time in milliseconds
    }
}
