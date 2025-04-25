package com.example.demo.Mappers.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example.demo.Dto.TaskListDto;
import com.example.demo.Entities.Task;
import com.example.demo.Entities.TaskList;
import com.example.demo.Entities.TaskStatus;
import com.example.demo.Mappers.TaskListMapper;
import com.example.demo.Mappers.TaskMapper;

@Component
public class TaskListMapperImpl implements TaskListMapper {

    private final TaskMapper taskMapper;

    public TaskListMapperImpl(TaskMapper taskMapper) {
        this.taskMapper = taskMapper;
    }

    @Override
    public TaskList fromDto(TaskListDto taskListDto) {
        return new TaskList(taskListDto.id(), taskListDto.title(),
                taskListDto.description(),
                Optional.ofNullable(taskListDto.tasks())
                        .map(tasks -> tasks.stream().map(taskMapper::fromDto).toList()).orElse(null),
                null, null

        );

    }

    @Override
    public TaskListDto toDto(TaskList taskList) {
        return new TaskListDto(taskList.getId(), taskList.getTitle(), taskList.getDescription(),

                Optional.ofNullable(taskList.getTasks())
                        .map(List::size)
                        .orElse(0),
                calculateTaskListProgress(taskList.getTasks()),

                Optional.ofNullable(taskList.getTasks())
                        .map(tasks -> tasks.stream().map(taskMapper::toDto).toList())
                        .orElse(null)

        );
    }

    private Double calculateTaskListProgress(List<Task> tasks) {
        if (tasks == null) {
            return null;
        }

        long closedTasksCount = tasks.stream()
                .filter(task -> task != null && TaskStatus.CLOSED == task.getStatus())
                .count();

        return (double) closedTasksCount / tasks.size();
    }
}
