package com.example.demo.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.Entities.TaskList;

public interface TaskListService {
    List<TaskList> listTaskLists();

    TaskList createTaskList(TaskList taskList);

    Optional<TaskList> getTaskList(UUID id);

    TaskList updateTaskList(UUID taskListId, TaskList taskList);

    void deleteTaskList(UUID taskListId);
}
