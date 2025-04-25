# Task Tracker App

The Task Tracker App is designed to help users organize their daily tasks, set priorities, and track their progress. This application provides a user-friendly way for creating, managing, and completing tasks, helping users increase their productivity and stay organized.

## Features

### Core Features

1. **Group Tasks into Task Lists**

   - Users can create task lists to group related tasks (e.g., "Work Tasks", "Personal Errands").
   - Each task list includes a title and an optional description.

2. **Update Task Lists**

   - Users can update a task list's name and description to keep it relevant.

3. **Delete Task Lists**

   - Users can delete task lists they no longer need or created by mistake.

4. **Capture Tasks**

   - Users can quickly add new tasks to a task list.
   - Each task includes a title, optional description, due date, and priority level.

5. **Update Tasks**

   - Users can edit tasks to adjust the title, description, due date, and priority level.

6. **Delete Tasks**

   - Users can delete tasks they created by mistake.

7. **Complete Tasks**

   - Users can mark tasks as complete to track their progress.

8. **Task Completion Progress**
   - Users are informed of their completion percentage of tasks in a task list to stay motivated.

### Bonus Features

- Set reminders for important tasks.
- Filter and sort tasks based on due date, priority, or task list.
- View a dashboard showing task completion statistics.
- Search for tasks across all task lists.
- Tagging system for tasks to allow for more flexible organization.
- Share task lists or individual tasks with other users.
- Integration with calendar applications to sync due dates and reminders.
- Pomodoro timer feature to help users focus on tasks.
- Gamification system with points and achievements to encourage consistent app usage.

## User Stories

### Task Lists

- **Group Tasks into Task Lists**: Create multiple task lists for different projects.
- **Update Task Lists**: Edit task list names and descriptions.
- **Delete Task Lists**: Remove task lists when no longer needed.

### Tasks

- **Capture Tasks**: Add new tasks quickly.
- **Update Tasks**: Edit task details (title, description, due date, and priority).
- **Delete Tasks**: Remove tasks created by mistake.
- **Complete Tasks**: Mark tasks as complete.

### Productivity

- **Task Completion Progress**: View task completion percentage to track productivity.

### Bonus

- Reminders, filtering/sorting, dashboard, search, tagging, sharing, calendar integrations, Pomodoro timer, and gamification.

## Tech Stack

- **Backend**: Java and Spring Boot
- **Build Tool**: Maven
- **Database**: [PostgreSQL](https://www.postgresql.org/) or another suitable solution.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/regisx001/Task_Tracker.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Task_Tracker
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
5. The application will start on `http://localhost:8080`.

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes.
   ```bash
   git commit -m "Add your feature or fix description"
   ```
4. Push your branch to your forked repository.
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a pull request to the main repository.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

- Inspired by productivity tools like Todoist, Microsoft To-Do, and Trello.

## Contact

For questions or support, please contact [regisx001](https://github.com/regisx001).
