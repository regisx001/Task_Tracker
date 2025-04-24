package com.example.demo.Dto;

import java.util.List;
import java.util.UUID;

public record TaskListDto(
        UUID id,
        String title,
        String desctiption,
        Integer count,
        Double progess,
        List<TaskDto> tasks

) {

}
