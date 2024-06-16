# To-Do List Manager

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Project Structure](#project-structure)
- [Classes and Methods](#classes-and-methods)
  - [Task Class](#task-class)
  - [TaskList Class](#tasklist-class)
  - [User Class](#user-class)
  - [Main Class](#main-class)
- [Usage](#usage)
- [Cloning the Repository](#cloning-the-repository)
- [Compiling and Running the Project](#compiling-and-running-the-project)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The To-Do List Manager is a simple Java application that allows users to manage their tasks. Each user has their own to-do list, and each to-do list is represented as a single linked list of tasks. The users are stored in an ArrayList. This project demonstrates the use of arrays, ArrayLists, and single linked lists in Java.

## Features

- Create users and store them in an ArrayList.
- Each user has a unique name.
- Add tasks to a user's to-do list.
- Each task has a description and a completion status (completed or pending).
- Tasks are stored in a single linked list for each user.
- Mark tasks as completed.
- View all tasks in a user's to-do list, along with their completion status.
- Delete tasks by their position in the list.

## Project Structure

The project consists of four main classes:

1. `Task`
2. `TaskList`
3. `User`
4. `Main`

## Classes and Methods

### Task Class

The `Task` class stores the description and completion status of a task. It includes methods to:

- Get the task description.
- Check if the task is completed.
- Mark the task as completed.
- Return a string representation of the task.

### TaskList Class

The `TaskList` class represents the to-do list for a user. It includes methods to:

- Add a task to the list.
- Mark a task as completed by its description.
- Delete a task by its position in the list.
- Print all tasks in the list with their positions.

### User Class

The `User` class stores the name of the user and their to-do list (a single linked list of tasks). It includes methods to:

- Add a task to the user's to-do list.
- Mark a task as completed by its description.
- Delete a task by its position in the list.
- Print all tasks in the user's to-do list.

### Main Class

The `Main` class handles the user interface and interactions. It includes methods to:

- Create a new user.
- Add a task to a user's to-do list.
- Mark a task as completed.
- View all tasks in a user's to-do list.
- Delete a task by its position in the list.
- Exit the application.

## Usage

1. **Create User**: Enter the user's name to create a new user.
2. **Add Task**: Enter the task description to add a new task to the user's to-do list.
3. **Mark Task as Completed**: Enter the task description to mark it as completed.
4. **View Tasks**: View all tasks in the user's to-do list along with their completion status.
5. **Delete Task**: View the list of tasks and enter the position of the task to delete it.
6. **Exit**: Exit the application.

## Cloning the Repository

To clone the repository, use the following command in your terminal:

```sh
git clone https://github.com/infuriated-mink/SEMESTER4-MIDTERM-DSA.git
```

## Compiling and Running the Project

Navigate to the Project Directory:

```sh
cd /path/to/your/cloned/repository
```

Compile the Project:

```sh
javac -d bin src/com/example/*.java
```

Run the Project:

```sh
java -cp bin com.example.Main
```

## Future Enhancements

- Edit Task: Allow users to edit the description of a task.
- Sort Tasks: Sort tasks based on their completion status or description.
- Save and Load: Save the state of the to-do lists to a file and load it on startup.
- User Authentication: Add user authentication to secure the to-do lists.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes. Ensure that your code follows the project's coding standards and includes appropriate tests.

## License

This project is licensed under the MIT License.
