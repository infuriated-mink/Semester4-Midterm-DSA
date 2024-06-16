package ToDoList;

public class TaskList {
    private class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public TaskList() {
        this.head = null;
    }

    // Method to add a task to the list
    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to mark a task as completed
    public void markTaskAsCompleted(String description) {
        Node current = head;
        while (current != null) {
            if (current.task.getDescription().equals(description)) {
                current.task.markAsCompleted();
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found: " + description);
    }

    // Method to delete a task from the list
    public void deleteTask(String description) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.getDescription().equals(description)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.task.getDescription().equals(description)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task not found: " + description);
        } else {
            current.next = current.next.next;
        }
    }

    // Method to print all tasks in the list
    public void printTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}