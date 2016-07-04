package org.ahu.edu.BigDataLab.web;

/**
 * Created by plutolove on 16-7-4.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class Hello {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}