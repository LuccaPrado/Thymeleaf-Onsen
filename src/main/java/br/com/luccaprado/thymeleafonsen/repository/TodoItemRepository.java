package br.com.luccaprado.thymeleafonsen.repository;

import br.com.luccaprado.thymeleafonsen.model.entity.TodoItem;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {

    Slice<TodoItem> findAll();

}
