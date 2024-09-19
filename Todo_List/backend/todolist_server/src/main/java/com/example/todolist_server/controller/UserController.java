package com.example.todolist_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.todolist_server.modules.User;
import com.example.todolist_server.service.UserService;

@RestController
public class UserController {
    public static void main(String[] arg) {

    }

    @Autowired
    private UserService userService;

    @GetMapping("/user/getUser")
    public ResponseEntity<Integer> getUser(@RequestBody User user){
        Integer userId = user.getId();
        this.userService.selectUser(null);

        return ResponseEntity.status(HttpStatus.OK).body(userId);
    }

    @PostMapping("/user/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        String message = "User created : " + user.getUsername()
                + ", Password: " + user.getPassword()
                + ", Email: " + user.getEmail();

        return ResponseEntity.status(HttpStatus.OK).body(message);

    }
}
