package br.com.luccaprado.thymeleafonsen.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoItemRequest {

    @NotEmpty(message = "The description of your item can't be null")
    private String description;

    @NotEmpty(message = "The name of your item can't be null")
    private String name;

}
