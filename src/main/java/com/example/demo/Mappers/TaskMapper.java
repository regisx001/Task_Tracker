package com.example.demo.Mappers;

import com.example.demo.Dto.TaskDto;
import com.example.demo.Entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);

    TaskDto toDto(Task task);

}
