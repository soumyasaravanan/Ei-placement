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
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        ConsoleObserver observer = new ConsoleObserver();
        manager.registerObserver(observer);
        TaskFactory factory = new TaskFactory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Choose an action: [1] Add Task [2] Remove Task [3] View Tasks [4] Exit");
                int action = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (action) {
                    case 1:
                        handleAddTask(scanner, factory, manager);
                        break;
                    case 2:
                        handleRemoveTask(scanner, manager);
                        break;
                    case 3:
                        manager.viewTasks();
                        break;
                    case 4:
                        System.out.println("Exiting the program.");
                        scanner.close(); // Close scanner before exiting
                        System.exit(0);
                    default:
                        System.out.println("Invalid action. Please choose a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid number.");
                scanner.next(); // clear the invalid input
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }

    private static void handleAddTask(Scanner scanner, TaskFactory factory, ScheduleManager manager) {
        try {
            System.out.println("Enter task description:");
            String description = scanner.nextLine();
            System.out.println("Enter start time (HH:MM):");
            String startTimeInput = scanner.nextLine();
            if (!TimeValidator.isValidTime(startTimeInput)) {
                System.out.println("Error: Invalid start time format. Please use HH:MM.");
                return;
            }
            LocalTime startTime = LocalTime.parse(startTimeInput);
            System.out.println("Enter end time (HH:MM):");
            String endTimeInput = scanner.nextLine();
            if (!TimeValidator.isValidTime(endTimeInput)) {
                System.out.println("Error: Invalid end time format. Please use HH:MM.");
                return;
            }
            LocalTime endTime = LocalTime.parse(endTimeInput);

            if (startTime.isAfter(endTime)) {
                System.out.println("Error: End time must be after start time.");
                return;
            }

            System.out.println("Enter priority (Low, Medium, High):");
            String priority = scanner.nextLine();

            Task task = factory.createTask(description, startTime, endTime, priority);
            manager.addTask(task);
        } catch (DateTimeParseException e) {
            System.out.println("Error: Invalid time format. Please use HH:MM.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while adding the task: " + e.getMessage());
        }
    }

    private static void handleRemoveTask(Scanner scanner, ScheduleManager manager) {
        try {
            System.out.println("Enter task description to remove:");
            String descToRemove = scanner.nextLine();
            manager.removeTask(descToRemove);
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while removing the task: " + e.getMessage());
        }
    }
}
