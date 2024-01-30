package com.example.studentrecordmanager.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentmanager")
public class Controller
{
    @GetMapping("/sayhi")
    public String SayHi(@RequestParam(name = "no") String no)
    {
        System.out.print(no);
        return "Hi";
    }
    @GetMapping("/sayhi/{no}")
    public String SayHi1(@PathVariable("no") String no)
    {
        System.out.print(no);
        return "Hi";
    }

}
