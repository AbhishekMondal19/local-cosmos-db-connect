package com.microsoft.azure.documentdb.sample.dao;

import com.microsoft.azure.documentdb.DocumentClient;
import com.microsoft.azure.documentdb.sample.model.TodoItem;

public class TestMain {
    public static void main(String[] args) {

        DocDbDao dao = new DocDbDao();

        TodoItem todoItem = TodoItem.builder().name("Dell").category("Laptop")
                .complete(true).build();
        dao.createTodoItem(todoItem);
    }
}
