package br.com.luccaprado.thymeleafonsen.service;

import br.com.luccaprado.thymeleafonsen.exception.TodoNotFoundException;
import br.com.luccaprado.thymeleafonsen.model.entity.TodoItem;
import br.com.luccaprado.thymeleafonsen.repository.TodoItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoItemService {

    private final TodoItemRepository repository;

    public void createTodoItem(TodoItem todoItem){
         repository.save(todoItem);
    }

    public void deleteTodoItem(Long todoId){
        TodoItem todoItem = repository.findById(todoId).orElseThrow(TodoNotFoundException::new);
        todoItem.setDeleted(true);
        repository.save(todoItem);
    }

    public List<TodoItem> listTodoItems(){
        return repository.findAll();
    }

    public TodoItem findById(Long id) {
        TodoItem todoItem = repository.findById(id).orElseThrow(TodoNotFoundException::new);
        return todoItem;
    }
}
