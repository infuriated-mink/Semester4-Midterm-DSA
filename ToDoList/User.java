package ToDoList;

public class User {
    private String name;
    private TaskList taskList;

    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        taskList.addTask(description);
    }

    public void markTaskAsCompleted(int taskIndex) {
        taskList.markTaskAsCompleted(taskIndex);
    }

    public void printAllTasks() {
        System.out.println("Tasks for " + name + ":");
        taskList.printAllTasks();
    }
}