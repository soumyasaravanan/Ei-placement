/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soumya
 */
import java.time.LocalTime;

public class Task {
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;
    private String priority;
    private boolean isCompleted;

    public Task(String description, LocalTime startTime, LocalTime endTime, String priority) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
        this.isCompleted = false;
    }

    // Getters, Setters, and other methods
    public void markCompleted() {
        this.isCompleted = true;
    }

    // Override toString for better output display
    @Override
    public String toString() {
        return startTime + " - " + endTime + ": " + description + " [" + priority + "]" + (isCompleted ? " (Completed)" : "");
    }
}
