package com.example.hola;

import org.springframework.web.bind.annotation.GetMapping;

public class HolaController {

    @GetMapping("")
    public String index() {
        return "Index";
    }
}