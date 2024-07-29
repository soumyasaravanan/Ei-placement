/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package astronaut;

/**
 *
 * @author soumya
 */
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> tasks;
    private List<Observer> observers;

    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        if (!isOverlapping(task)) {
            tasks.add(task);
            notifyObservers("Task added: " + task.getDescription());
        } else {
            notifyObservers("Error: Task conflicts with an existing task.");
        }
    }

    public void removeTask(String description) {
        // Logic to remove task by description
    }

    public void viewTasks() {
        tasks.sort((t1, t2) -> t1.getStartTime().compareTo(t2.getStartTime()));
        tasks.forEach(System.out::println);
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    private boolean isOverlapping(Task newTask) {
        for (Task task : tasks) {
            if (task.getStartTime().isBefore(newTask.getEndTime()) && newTask.getStartTime().isBefore(task.getEndTime())) {
                return true;
            }
        }
        return false;
    }
}

