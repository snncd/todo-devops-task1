package com.snn.todotask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@SpringBootApplication
public class TodoTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoTaskApplication.class, args);
    }

    @GetMapping(value = "/")
    public String getName(){
        return "My name is todo-task. Today : " + new Date();
    }

}
