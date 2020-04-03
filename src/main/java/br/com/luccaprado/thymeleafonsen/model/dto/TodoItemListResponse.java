package br.com.luccaprado.thymeleafonsen.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoItemListResponse {

    private Long id;

    private String name;

    private Boolean complete;

}
