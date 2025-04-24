package com.example.demo.Mappers.impl;

import org.springframework.stereotype.Component;

import com.example.demo.Dto.TaskDto;
import com.example.demo.Entities.Task;
import com.example.demo.Mappers.TaskMapper;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public Task fromDto(TaskDto taskDto) {
        return new Task(
                taskDto.id(),
                taskDto.title(),
                taskDto.desctiption(),
                taskDto.dueDate(),
                taskDto.status(),
                taskDto.priority(),
                null, null, null);
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(task.getId(), task.getTitle(), task.getDescription(), task.getDueDate(), task.getPriority(),
                task.getStatus());
    }

}
