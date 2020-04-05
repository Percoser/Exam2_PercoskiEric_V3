package com.example.demo.Models;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.ResultSet;

@Entity
@Table(name = "virus")
public class Virus {
    @Id
    @Column (name = "id")
    public String id;
    @Column(name = "name")
    public String name;
    @Column(name = "description")
    public String description;
    @Column(name = "symptoms")
    public String symptoms;
    @Column(name = "duration")
    public int duration;
    @Column(name = "mortal")
    public double mortal;
    @Column(name = "imageaddress")
    private String image;

    public Virus() {
    }

    public Virus(String id,String name, String description, String symptoms, int duration, double mortal, String image) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
        this.duration = duration;
        this.mortal = mortal;
        this.image = image;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getMortal() {
        return mortal;
    }

    public void setMortal(double mortal) {
        this.mortal = mortal;
    }

    public String getImage(){ return image; }

    public void setImage(String image){this.image = image;}

}
