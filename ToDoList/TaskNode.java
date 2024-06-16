package ToDoList;

public class TaskNode {
    // TaskNode class to represent a node in the linked list
    Task task;
    TaskNode next;

    public TaskNode(Task task) {
        this.task = task;
        this.next = null;
    }
}