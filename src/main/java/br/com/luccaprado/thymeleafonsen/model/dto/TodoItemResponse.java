package br.com.luccaprado.thymeleafonsen.model.dto;

import lombok.Data;

@Data
public class TodoItemResponse {

    private String description;

    private Double duration;

    private Boolean complete;

}
