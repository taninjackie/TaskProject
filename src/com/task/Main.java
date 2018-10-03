package com.task;

import java.time.ZonedDateTime;
import java.util.ArrayDeque;
import java.util.*;
import java.io.*;

class Task
{
    private String name;
    private ZonedDateTime timestamp;

    public Task(String n)
    {
        name = n;
        timestamp = ZonedDateTime.now();
    }

    public void print()
    {
        System.out.println("New task = ");
    }
}

class TaskQueue extends ArrayDeque<Task> {
    public void list()
    {

    }

    public void commit() { /* add your code to commit n tasks */ }

    public void rollback() { /* add your code to rollback n tasks */ }
}

public class Main {

    public static void main(String[] args)
    {
        TaskQueue Shelve = new TaskQueue();
        Scanner scan = new Scanner(System.in);
        String input = "";

            while (input.compareToIgnoreCase("q") != 0) {
                System.out.printf("Add (A) | List (L) | commit (C) | rollback (R) | quit (Q) >> ");
                input = scan.next();
                if (input.compareToIgnoreCase("A") == 0)
                {
                    System.out.print("New Task = ");
                    scan.nextLine();
                    Shelve.add(new Task(scan.nextLine()));

                } else if (input.compareToIgnoreCase("L") == 0) {

                } else if (input.compareToIgnoreCase("C") == 0) {

                } else if (input.compareToIgnoreCase("R") == 0) {

                }

        }
    }

}
