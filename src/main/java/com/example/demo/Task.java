package com.example.demo;

import java.util.UUID;

public class Task {

    UUID id;
    String name;

    public Task(String name){
        this.name = name;
    }

    public Task(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
