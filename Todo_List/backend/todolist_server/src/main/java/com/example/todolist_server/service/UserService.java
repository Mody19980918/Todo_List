package com.example.todolist_server.service;

import com.diamondfsd.jooq.learn.codegen.tables.records.TodolistUserRecord;
import static com.diamondfsd.jooq.learn.codegen.tables.TodolistUser.TODOLIST_USER;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

@Service
public class UserService {
    private String username = "root";
    private String password = "root";
    private String url = "jdbc:mysql//localhost:3306/todolist";

    public static void main(String[] arg) {
    }

    public void selectUser(String[] args) {
        // Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            DSLContext context = DSL.using(conn, SQLDialect.MYSQL);

            List<TodolistUserRecord> userList = 
            context
            .selectFrom(TODOLIST_USER)
            .fetchInto(TodolistUserRecord.class);

            userList.forEach(user -> {
                System.out.printf(
                        "Id: %s, usrname: %s, password: %s, email: %s\n",
                        user.getId(), user.getUsername(), user.getPassword(), user.getEmail());
            });



        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
