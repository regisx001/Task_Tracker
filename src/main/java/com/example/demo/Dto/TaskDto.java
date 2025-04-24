package com.example.demo.Dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.example.demo.Entities.TaskPriority;
import com.example.demo.Entities.TaskStatus;

public record TaskDto(
        UUID id,
        String title,
        String desctiption,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
// LocalDateTime createAt,
// LocalDateTime updateAt

) {

}
