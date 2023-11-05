package com.example.jacocospringtestpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class Controller1 {

    @GetMapping("controller1")
    public String controller1() {
        return "OK1";
    }


    @GetMapping("controller2")
    public String controller2() {
        return getController2();
    }

    private String getController2() {
        int i = 10;
        i = ++i;
        return "abc" + i;
    }
}
