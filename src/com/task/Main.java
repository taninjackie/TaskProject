package com.task;

class Task {
    private String name;
    private ZonedDateTime timestamp;

    public Task(String n) {
        name = n;
        timestamp = ZonedDateTime.now();
    }

    public void print() { /* add your code */ }
}

class TaskQueue extends ArrayDeque<Task> {
    public void list() { /* add your code to list all tasks */ }

    public void commit() { /* add your code to commit n tasks */ }

    public void rollback() { /* add your code to rollback n tasks */ }
}

public class Main {

    public static void main(String[] args) {
	   
    }
}
