package br.com.luccaprado.thymeleafonsen.model.mapper;

import br.com.luccaprado.thymeleafonsen.model.dto.TodoItemListResponse;
import br.com.luccaprado.thymeleafonsen.model.dto.TodoItemRequest;
import br.com.luccaprado.thymeleafonsen.model.dto.TodoItemResponse;
import br.com.luccaprado.thymeleafonsen.model.entity.TodoItem;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TodoItemMapper {

    TodoItem requestToEntity(TodoItemRequest todoItemRequest);

    TodoItemListResponse entityListToResponse(TodoItem todoItem);

    TodoItemResponse entityToResponse(TodoItem todoItem);

}
