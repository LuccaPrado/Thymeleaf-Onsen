package br.com.luccaprado.thymeleafonsen.repository;

import br.com.luccaprado.thymeleafonsen.model.entity.TodoItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

    List<TodoItem> findAll();

}
