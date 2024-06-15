package To Do List;

public class TaskList {
    private TaskNode head;

    public TaskList() {
        this.head = null;
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        TaskNode newNode = new TaskNode(newTask);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markTaskAsCompleted(int taskIndex) {
        TaskNode current = head;
        int index = 0;
        while (current != null && index < taskIndex) {
            current = current.next;
            index++;
        }
        if (current != null) {
            current.task.markAsCompleted();
        }
    }

    public void printAllTasks() {
        TaskNode current = head;
        int index = 0;
        while (current != null) {
            System.out.println(index + ": " + current.task);
            current = current.next;
            index++;
        }
    }
}