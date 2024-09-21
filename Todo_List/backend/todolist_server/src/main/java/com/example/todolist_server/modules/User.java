package com.example.todolist_server.modules;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;

    public User(int id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail(){
        return email;
    }

    public Integer getId(){
        return id;
    }

}
