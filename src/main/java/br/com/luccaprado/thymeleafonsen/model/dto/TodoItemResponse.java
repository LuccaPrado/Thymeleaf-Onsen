package br.com.luccaprado.thymeleafonsen.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoItemResponse {

    private Long id;

    private String name;

    private String description;

    private Double duration;

    private Boolean complete;

}
