package com.example.demo.Services;

import java.util.List;

import com.example.demo.Entities.TaskList;

public interface TaskListService {
    List<TaskList> listTaskLists();

    TaskList createTaskList(TaskList taskList);
}
