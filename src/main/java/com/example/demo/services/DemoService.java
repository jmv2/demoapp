package com.example.demo.services;

import com.example.demo.entities.Demo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {

    private final List<Demo> demoList =  new ArrayList<>();

    public DemoService() {
        demoList.add(new Demo("si se juntan los mares y los rios, porque no juntar...", "lucho"));
        demoList.add(new Demo("vamo a cu... minas ricas", "chico"));
        demoList.add(new Demo("Quisiera ser pirata, para encontrar el tesoro que tienes entre pata y pata", "anonimo"));
        demoList.add(new Demo("Si tu me amas como yo te amo, por que no nos besamos por donde meamo", "papa del lucho"));

    }

    public ResponseEntity<List<Demo>> findAll(){

        return ResponseEntity.ok(demoList);
    }

}
