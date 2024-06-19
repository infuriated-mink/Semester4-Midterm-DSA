package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // ArrayList to store all the users
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create User");
            System.out.println("2. Add Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. Delete Task");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    createUser(scanner);
                    break;
                case 2:
                    addTask(scanner);
                    break;
                case 3:
                    markTaskAsCompleted(scanner);
                    break;
                case 4:
                    viewTasks(scanner);
                    break;
                case 5:
                    deleteTask(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to create a new user
    private static void createUser(Scanner scanner) {
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        users.add(new User(name));
        System.out.println("User created: " + name);
    }

    // Method to add a task to the user
    private static void addTask(Scanner scanner) {
        User user = getUser(scanner);
        if (user != null) {
            System.out.print("Enter task description: ");
            String description = scanner.nextLine();
            user.addTask(description);
            System.out.println("Task added: " + description);
        }
    }

    // Method to mark a task as completed
    private static void markTaskAsCompleted(Scanner scanner) {
        User user = getUser(scanner);
        if (user != null) {
            System.out.print("Enter task description to mark as completed: ");
            String description = scanner.nextLine();
            user.markTaskAsCompleted(description);
            System.out.println("Task marked as completed: " + description);
        }
    }

    // Method to view all the tasks of the user
    private static void viewTasks(Scanner scanner) {
        User user = getUser(scanner);
        if (user != null) {
            user.printTasks();
        }
    }

    // Method to delete a task from the user
    private static void deleteTask(Scanner scanner) {
        User user = getUser(scanner);
        if (user != null) {
            user.printTasks();
            System.out.print("Enter task position to delete: ");
            int position = scanner.nextInt();
            scanner.nextLine();
            user.deleteTask(position);
            System.out.println("Task deleted at position: " + position);
        }
    }

    // Method to get the user from the list of users
    private static User getUser(Scanner scanner) {
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        System.out.println("User not found: " + name);
        return null;
    }
}
