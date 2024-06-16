package ToDoList;

public class Task {
    private String description;
    private boolean isCompleted;

    // Constructor to create a task
    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    // Method to mark a task as completed
    public boolean isCompleted() {
        return isCompleted;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return description + " [" + (isCompleted ? "Completed" : "Pending") + "]";
    }
}