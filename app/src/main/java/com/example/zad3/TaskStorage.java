package com.example.zad3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();

    private final List<Task> tasks;

    public static TaskStorage getInstance() {
        return taskStorage;
    }

    private TaskStorage() {
        tasks = new ArrayList<>();
        for (int i = 0; i <= 130; i++) {
            Task task = new Task();
            task.setName("Pilne zadanie numer: " + i);
            task.setDone(i % 3 == 0);
            tasks.add(task);
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Task getTask(UUID id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId().equals(id)) {
                return tasks.get(i);
            }
        }
        //!!!!!!!!
        return null;
    }
}
