/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class JUnitTest {

  private TaskManager taskManager;

  @BeforeEach
  public void setUp() {
    taskManager = new TaskManager();

    // Add some sample tasks for testing
    taskManager.addTask("Mike Smith", "Create Login", 5.0, "To Do");
    taskManager.addTask("Edward Harrison", "Create Add Features", 8.0, "Doing");
    taskManager.addTask("Samantha Paulson", "Create Reports", 2.0, "Done");
  }

  @Test
  public void testAddTask() {
    String developerName = "Glenda Oberholzer";
    String taskName = "Add Arrays";
    double taskDuration = 11.0;
    String taskStatus = "To Do";

    taskManager.addTask(developerName, taskName, taskDuration, taskStatus);

    // Assert that the task was added correctly
    assertEquals(developerNames.get(3), developerName); // Assuming developerNames is accessible for testing
    assertEquals(taskNames.get(3), taskName); // Assuming taskNames is accessible for testing
    assertEquals(taskDurations.get(3), taskDuration); // Assuming taskDurations is accessible for testing
    assertEquals(taskStatuses.get(3), taskStatus); // Assuming taskStatuses is accessible for testing
  }

  @Test
  public void testDisplayCompletedTasks() {
    ArrayList<String> expectedOutput = new ArrayList<>();
    expectedOutput.add("  - Developer: Samantha Paulson");
    expectedOutput.add("    Task Name: Create Reports");
    expectedOutput.add("    Duration: 2.0 hours");

    // Capture the output of displayCompletedTasks
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    taskManager.displayCompletedTasks();
    System.setOut(System.out);

    String actualOutput = outContent.toString();

    // Assert that the displayed output matches the expected output
    assertTrue(actualOutput.containsAll(expectedOutput));
  }

  @Test
  public void testDisplayTaskWithLongestDuration() {
    String expectedDeveloper = "Edward Harrison";
    double expectedDuration = 8.0;

    // Capture the output of displayTaskWithLongestDuration
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    taskManager.displayTaskWithLongestDuration();
    System.setOut(System.out);

    String actualOutput = outContent.toString();

    // Assert that the displayed output contains the expected developer and duration
    assertTrue(actualOutput.contains(expectedDeveloper));
    assertTrue(actualOutput.contains(String.valueOf(expectedDuration)));
  }

  @Test
  public void testSearchTaskByName() {
    String taskNameToSearch = "Create Login";
    String expectedDeveloper = "Mike Smith";
    String expectedStatus = "To Do";

    // Capture the output of searchTaskByName
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    taskManager.searchTaskByName(taskNameToSearch);
    System.setOut(System.out);

    String actualOutput = outContent.toString();

    // Assert that the displayed output contains the expected developer and status
    assertTrue(actualOutput.contains(expectedDeveloper));
    assertTrue(actualOutput.contains(expectedStatus));
  }

  @Test
  public void testSearchTasksByDeveloper() {
    String developerNameToSearch = "Samantha Paulson";
    String expectedTaskName = "Create Reports";

    // Capture the output of searchTasksByDeveloper
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    taskManager.searchTasksByDeveloper(developerNameToSearch);
    System.setOut(System.out);

    String actualOutput = outContent.toString();

    // Assert that the displayed output contains the expected task name
    assertTrue(actualOutput.contains(expectedTaskName));
  }

  @Test
  public void testDeleteTask() {
    String taskNameToDelete = "Create Login";
    String expectedMessage = "Task \"" + taskNameToDelete + "\" successfully deleted.";

    String deleteMessage = taskManager.deleteTask(task

