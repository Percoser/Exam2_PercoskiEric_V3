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
    @RequestMapping("/getImageFromBlob/{image}")
    public void getImageFromBlob(ExpiresFilter.XHttpServletResponse response) throws Exception {
        response.setContentType("image/jpeg");

        Virus photo = new Virus();
        Blob blob = photo.getImage();
        byte[] bytes = blob.getBytes(1, (int) blob.length());
        InputStream inputStream = new ByteArrayInputStream(bytes);
        IOUtils.copy(inputStream, response.getOutputStream());
    }

}
