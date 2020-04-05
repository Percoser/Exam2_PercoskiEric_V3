package com.example.demo;

import com.example.demo.Models.Virus;
import com.example.demo.Models.VirusRepo;
import org.apache.catalina.filters.ExpiresFilter;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

@Controller
public class mainController {
    @Autowired
    VirusRepo virusRepo;

    @RequestMapping("/")
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("virusList", virusRepo.findAll());

        return mv;
    }

}
