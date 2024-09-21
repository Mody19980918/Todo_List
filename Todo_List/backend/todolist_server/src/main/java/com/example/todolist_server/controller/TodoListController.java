package com.example.todolist_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {

    public static void main(String[] args) {

    }

    @GetMapping("/todoList")
    public String Hello() {
        return "Hellooooo";
    }
}