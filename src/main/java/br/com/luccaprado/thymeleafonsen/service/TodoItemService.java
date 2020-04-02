package br.com.luccaprado.thymeleafonsen.service;

import br.com.luccaprado.thymeleafonsen.exception.TodoNotFoundException;
import br.com.luccaprado.thymeleafonsen.model.entity.TodoItem;
import br.com.luccaprado.thymeleafonsen.repository.TodoItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoItemService {

    private final TodoItemRepository repository;

    public Long createTodoItem(TodoItem todoItem){
        return repository.save(todoItem).getId();
    }

    public void deleteTodoItem(Long todoId){
        TodoItem todoItem = repository.findById(todoId).orElseThrow(TodoNotFoundException::new);
        todoItem.setDeleted(true);
        repository.save(todoItem);
    }

    public Slice<TodoItem> listTodoItems(){
        return repository.findAll();
    }

}
