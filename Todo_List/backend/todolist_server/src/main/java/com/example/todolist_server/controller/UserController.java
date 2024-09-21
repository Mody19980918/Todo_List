package com.example.todolist_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.diamondfsd.jooq.learn.codegen.tables.records.TodolistUserRecord;
import com.example.todolist_server.modules.User;
import com.example.todolist_server.service.UserService;

@RestController
public class UserController {    
    @Autowired
    private UserService userService;
    public static void main(String[] arg) {

    }

    @GetMapping("/user/getUser")
    public ResponseEntity<String> getUser(@RequestBody User user){
        Integer userId = user.getId();
        // List<TodolistUserRecord> userList =  this.userService.selectUser(userId);
        return ResponseEntity.status(HttpStatus.OK).body("Hello World");
    }

    @PostMapping("/user/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        String message = "User created : " + user.getUsername()
                + ", Password: " + user.getPassword()
                + ", Email: " + user.getEmail();

        return ResponseEntity.status(HttpStatus.OK).body(message);

    }
}
