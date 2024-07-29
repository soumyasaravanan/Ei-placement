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

public class TaskFactory {
    public Task createTask(String description, LocalTime startTime, LocalTime endTime, String priority) {
        return new Task(description, startTime, endTime, priority);
    }
}
