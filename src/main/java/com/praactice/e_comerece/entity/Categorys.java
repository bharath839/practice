package com.praactice.e_comerece.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "categorys")
public class Categorys {

    @Id
    private Long id;
    @Column(name = "name")
    private String name;


    public TimeStamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(TimeStamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    @OneToOne
    private TimeStamp timeStamp;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
