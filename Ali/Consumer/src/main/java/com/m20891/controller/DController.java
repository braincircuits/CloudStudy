package com.m20891.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
public class DController {
    @GetMapping("/get")
    public String get(HttpServletRequest request) {
        System.out.println(request.getRequestURL());
        System.out.println(request.getHeader("X-Request-red"));
        return "OK";
    }
}
