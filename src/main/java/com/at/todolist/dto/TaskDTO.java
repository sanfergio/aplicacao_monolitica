package com.at.todolist.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TaskDTO {
    private Long id;

    @NotBlank(message = "Título é obrigatório")
    private String title;

    private String description;

    private boolean completed;
}