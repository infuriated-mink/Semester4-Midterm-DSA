package ToDoList;

public class User {
    private String name;
    private TaskList taskList;

    // Constructor to create a user
    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    // Getter
    public String getName() {
        return name;
    }

    // Method to add a task to the user's task list
    public void addTask(String description) {
        taskList.addTask(new Task(description));
    }

    // Method to mark a task as completed
    public void markTaskAsCompleted(String description) {
        taskList.markTaskAsCompleted(description);
    }

    // Method to delete a task from the user's task list
    public void deleteTask(String description) {
        taskList.deleteTask(description);
    }

    // Method to print all tasks for the user
    public void printTasks() {
        System.out.println("Tasks for " + name + ":");
        taskList.printTasks();
    }
}