package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public void addTask(String name){
        taskRepository.addTask(new Task(UUID.randomUUID(),name));
    }

    public List getAll(){
        return taskRepository.getAll();
    }

}
