/*
 * This file is generated by jOOQ.
 */
package com.diamondfsd.jooq.learn.codegen;


import com.diamondfsd.jooq.learn.codegen.tables.TodolistUser;
import com.diamondfsd.jooq.learn.codegen.tables.records.TodolistUserRecord;

import javax.annotation.processing.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>todolist</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TodolistUserRecord, Integer> IDENTITY_TODOLIST_USER = Identities0.IDENTITY_TODOLIST_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TodolistUserRecord> KEY_TODOLIST_USER_PRIMARY = UniqueKeys0.KEY_TODOLIST_USER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TodolistUserRecord, Integer> IDENTITY_TODOLIST_USER = Internal.createIdentity(TodolistUser.TODOLIST_USER, TodolistUser.TODOLIST_USER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<TodolistUserRecord> KEY_TODOLIST_USER_PRIMARY = Internal.createUniqueKey(TodolistUser.TODOLIST_USER, "KEY_todolist_user_PRIMARY", TodolistUser.TODOLIST_USER.ID);
    }
}
