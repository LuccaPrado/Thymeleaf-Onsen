package br.com.luccaprado.thymeleafonsen.model.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public class TodoItemUpdateRequest {

    @NotEmpty(message = "The description of your item can't be null")
    private String description;

    @Positive(message = "You need to put an positive value")
    @NotNull(message = "You need to estimate an duration for it")
    private Double duration;


    private Boolean complete;
}
