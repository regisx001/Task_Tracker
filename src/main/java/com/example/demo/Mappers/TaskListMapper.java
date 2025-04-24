package com.example.demo.Mappers;

import com.example.demo.Dto.TaskListDto;
import com.example.demo.Entities.TaskList;

public interface TaskListMapper {
    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);
}
