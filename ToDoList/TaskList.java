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

    public void deleteTask(int position) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        Node current = head;
        Node previous = null;
        int currentIndex = 0;

        while (current != null && currentIndex != position) {
            previous = current;
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Task not found at position: " + position);
            return;
        }

        if (previous == null) {
            // The task to be deleted is the head
            head = current.next;
        } else {
            // Bypass the current node
            previous.next = current.next;
        }

        // Ensure the deleted node's next pointer is set to null
        current.next = null;
    }

    public void printTasks() {
        Node current = head;
        int index = 0;
        while (current != null) {
            System.out.println(index + ": " + current.task);
            current = current.next;
            index++;
        }
    }
}