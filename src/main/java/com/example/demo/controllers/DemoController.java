package com.example.demo.controllers;


import com.example.demo.entities.Demo;
import com.example.demo.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping({"/demo",""})
public class DemoController {
    @Autowired
    DemoService demoService;

    @GetMapping("/")
    public ResponseEntity<List<Demo>> getDemo(){
        return demoService.findAll();

    }


}
