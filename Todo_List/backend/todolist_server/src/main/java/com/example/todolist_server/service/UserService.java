package com.example.todolist_server.service;
import com.diamondfsd.jooq.learn.codegen.tables.records.TodolistUserRecord;
import static com.diamondfsd.jooq.learn.codegen.tables.TodolistUser.TODOLIST_USER;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {
    private static DSLContext context = null;

    private static String username = "root";
    private static String password = "root";
    private static String url = "jdbc:mysql://localhost:3306/todolist";

    public static void main(String[] arg) {

    }

    public DSLContext connectDatabase() {
        DSLContext context = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            context = DSL.using(conn, SQLDialect.MYSQL);
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found : " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Database access error : " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred : " + e.getMessage());
        }
        return context;
    }

    public List<TodolistUserRecord> selectUser(Integer userId) {
        context = connectDatabase();
        List<TodolistUserRecord> userList = context
                .selectFrom(TODOLIST_USER)
                .fetchInto(TodolistUserRecord.class);
        return userList;
    }
}
