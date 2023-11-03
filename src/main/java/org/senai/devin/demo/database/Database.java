package org.senai.devin.demo.database;

import org.senai.devin.demo.model.Task;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private static List<Task> tasks = new ArrayList<>();

    public static void add(Task task){
        Database.tasks.add(task);
    }

    public static void remove(Integer id){
        Database.tasks.removeIf(task -> task.getId().equals(id));
    }

    public static List<Task> listAll(){
        return Database.tasks;
    }

    public Task get(Integer id){
        return Database.tasks.stream().filter(task -> task.getId().equals(id)).findFirst().orElse(other:null);
    }
}
