package com.example.demo.Models;

import org.springframework.data.repository.CrudRepository;

import java.sql.ResultSet;

public interface VirusRepo extends CrudRepository<Virus, String> {

}
