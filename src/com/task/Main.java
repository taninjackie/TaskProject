package com.task;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


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
        System.out.printf("%s %s\n",name,timestamp.format(DateTimeFormatter.RFC_1123_DATE_TIME));
    }

}

class TaskQueue extends ArrayDeque<Task> {
    public void list()
    {
        for(int i=0;i<this.size();i++)
        {
            this.add(peekFirst());
            this.pollFirst().print();
        }

    }

    public void commit()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of task to commit ");
        int j = scan.nextInt();
        if(this.isEmpty())
            System.out.print("No task to commit\n");
        else {
            for (int i = 0; i < j; i++) {
                this.pollFirst().print();
            }
        }
    }

    public void rollback()
    {

            Scanner scan = new Scanner(System.in);
            System.out.print("Number of task to rollback ");
            int j = scan.nextInt();
            if (this.isEmpty())
                System.out.print("No task to rollback\n");
            else {
                for (int i = 0; i < j; i++) {
                    this.pollLast().print();
                }

            }
    }
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

                } else if (input.compareToIgnoreCase("L") == 0)
                {
                    Shelve.list();

                } else if (input.compareToIgnoreCase("C") == 0)
                {
                    Shelve.commit();

                } else if (input.compareToIgnoreCase("R") == 0)
                {
                    Shelve.rollback();
                }

        }
    }

}
