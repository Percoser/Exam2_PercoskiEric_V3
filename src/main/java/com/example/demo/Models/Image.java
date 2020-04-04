package com.example.demo.Models;

import java.sql.Blob;
import java.util.List;

public interface Image {
    public List<Virus> virusList();
    public Blob getImage(String image);
}
