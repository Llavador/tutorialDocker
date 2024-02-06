package com.example.hola;

import org.springframework.web.bind.annotation.GetMapping;

public class HolaController {

    @GetMapping("")
    public String index() {
        try {
            return "index";
        } catch (Exception e) {
            return "error";
        }
    }

    @GetMapping("/")
    public String index2() {
        try {
            return "index";
        } catch (Exception e) {
            return "error";
        }
    }
}