/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("****** Enter Task Details ******");
        System.out.print("Developer Name: ");
        String developerName = scanner.nextLine();

        System.out.print("Task Name: ");
        String taskName = scanner.nextLine();

        System.out.print("Estimated Task Duration (hours): ");
        double taskDuration;
        while (!scanner.hasNextDouble()) { // Ensure valid numeric input
            System.out.println("Invalid input. Please enter a number for task duration.");
            scanner.nextLine(); // Clear invalid input
            System.out.print("Task Duration (hours): ");
        }
        taskDuration = scanner.nextDouble();

        String[] options = {"In Progress", "Completed", "To Do"};
        int selectedOption;
        do { // Ensure valid selection
            System.out.println("\nSelect Task Status:");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Enter option number (1-" + options.length + "): ");
            while (!scanner.hasNextInt()) { // Ensure valid integer input
                System.out.println("Invalid input. Please enter a number between 1 and " + options.length + ".");
                scanner.nextLine(); // Clear invalid input
                System.out.print("Enter option number (1-" + options.length + "): ");
            }
            selectedOption = scanner.nextInt();
        } while (selectedOption < 1 || selectedOption > options.length); // Loop until valid option is chosen

        String taskStatus = options[selectedOption - 1];

        System.out.println("\nCreated Task:");
        System.out.println("Developer Name: " + developerName);
        System.out.println("Task Name: " + taskName);
        System.out.println("Task Duration: " + taskDuration + " hours");
        System.out.println("Task Status: " + taskStatus);

        scanner.close();
    }
}
