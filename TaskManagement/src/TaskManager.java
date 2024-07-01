/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */

import java.util.ArrayList;

public class TaskManager {

  private ArrayList<String> developerNames = new ArrayList<>(); // Stores developer names
  private ArrayList<String> taskNames = new ArrayList<>(); // Stores task names
  private ArrayList<Integer> taskIDs = new ArrayList<>(); // Stores unique task IDs
  private ArrayList<Double> taskDurations = new ArrayList<>(); // Stores task durations
  private ArrayList<String> taskStatuses = new ArrayList<>(); // Stores task statuses

  private int nextTaskID = 1; // Counter for generating unique IDs

  // Method to add a new task (assuming validation is done elsewhere)
  public void addTask(String developerName, String taskName, double taskDuration, String taskStatus) {
    developerNames.add(developerName);
    taskNames.add(taskName);
    taskIDs.add(nextTaskID++); // Generate and assign unique ID
    taskDurations.add(taskDuration);
    taskStatuses.add(taskStatus);
  }

  // Display completed tasks (Developer, Task Name, Duration)
  public void displayCompletedTasks() {
    System.out.println("\nCompleted Tasks:");
    for (int i = 0; i < taskStatuses.size(); i++) {
      if (taskStatuses.get(i).equalsIgnoreCase("done")) {
        System.out.println("  - Developer: " + developerNames.get(i));
        System.out.println("    Task Name: " + taskNames.get(i));
        System.out.println("    Duration: " + taskDurations.get(i) + " hours");
      }
    }
  }

  // Find and display task with longest duration (Developer, Duration)
  public void displayTaskWithLongestDuration() {
    if (taskDurations.isEmpty()) {
      System.out.println("No tasks found.");
      return;
    }

    int maxIndex = 0; // Index of task with longest duration
    for (int i = 1; i < taskDurations.size(); i++) {
      if (taskDurations.get(i) > taskDurations.get(maxIndex)) {
        maxIndex = i;
      }
    }
    System.out.println("\nTask with Longest Duration:");
    System.out.println("  - Developer: " + developerNames.get(maxIndex));
    System.out.println("    Duration: " + taskDurations.get(maxIndex) + " hours");
  }

  // Search for a task by name and display details (Task Name, Developer, Status)
  public void searchTaskByName(String taskName) {
    int foundIndex = taskNames.indexOf(taskName);
    if (foundIndex == -1) {
      System.out.println("Task not found.");
      return;
    }
    System.out.println("\nTask Details:");
    System.out.println("  - Task Name: " + taskNames.get(foundIndex));
    System.out.println("    Developer: " + developerNames.get(foundIndex));
    System.out.println("    Status: " + taskStatuses.get(foundIndex));
  }

  // Search for all tasks assigned to a developer and display details (Task Name, Status)
  public void searchTasksByDeveloper(String developerName) {
    System.out.println("\nTasks assigned to " + developerName + ":");
    for (int i = 0; i < developerNames.size(); i++) {
      if (developerNames.get(i).
