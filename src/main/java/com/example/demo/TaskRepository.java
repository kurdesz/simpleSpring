package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {

    private static List tasks = new ArrayList<Task>();

    public void addTask(Task task){
        tasks.add(task);
    }

    public List getAll(){
        return tasks;
    }
}
