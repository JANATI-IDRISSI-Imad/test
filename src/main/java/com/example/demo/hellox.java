package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class hellox {
    @GetMapping("/driss")
    public String getCarById(){
        return "Driss Nod Tqowad";
    }

}
