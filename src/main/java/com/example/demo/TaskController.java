package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/add")
    @ResponseStatus(value = HttpStatus.CREATED, reason = "Task created!")
    public void getTask(@RequestParam String name){
        taskService.addTask(name);
    }

    @GetMapping("/get")
    public List getTasks(){
        return taskService.getAll();
    }

    @GetMapping("/")
    public String getSomething(){
        return "Hello!";
    }
}
