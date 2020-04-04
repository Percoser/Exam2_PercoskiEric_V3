package com.example.demo.Models;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Blob;
import java.util.List;

public class VirusImp implements Image {
    @Autowired
    VirusRepo virusRepo;

    @Override
    public List<Virus> virusList() {
        List<Virus> virusList = (List<Virus>) virusRepo.findAll();
        return null;
    }

    @Override
    public Blob getImage(String image) {
        return null;
    }
}
