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

    // Getters
    public String getDescription() {
        return description;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    // Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return startTime + " - " + endTime + ": " + description + " [" + priority + "]" + (isCompleted ? " (Completed)" : "");
    }
}
