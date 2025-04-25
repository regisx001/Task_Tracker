package com.example.demo.Dto;

import java.util.List;
import java.util.UUID;

public record TaskListDto(
                UUID id,
                String title,
                String description,
                Integer count,
                Double progess,
                List<TaskDto> tasks

) {

}
