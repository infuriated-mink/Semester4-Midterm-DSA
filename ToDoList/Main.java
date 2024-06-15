package ToDoList;

import java.util.ArrayList;

public class Main {
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) {
        createUser("Alice");
        createUser("Bob");

        addTaskToUser("Alice", "Buy groceries");
        addTaskToUser("Alice", "Read a book");
        addTaskToUser("Bob", "Go for a run");

        markTaskAsCompletedForUser("Alice", 0);

        printAllTasksForUser("Alice");
        printAllTasksForUser("Bob");
    }

    public static void createUser(String name) {
        users.add(new User(name));
    }

    public static void addTaskToUser(String userName, String taskDescription) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                user.addTask(taskDescription);
                break;
            }
        }
    }

    public static void markTaskAsCompletedForUser(String userName, int taskIndex) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                user.markTaskAsCompleted(taskIndex);
                break;
            }
        }
    }

    public static void printAllTasksForUser(String userName) {
        for (User user : users) {
            if (user.getName().equals(userName)) {
                user.printAllTasks();
                break;
            }
        }
    }
}