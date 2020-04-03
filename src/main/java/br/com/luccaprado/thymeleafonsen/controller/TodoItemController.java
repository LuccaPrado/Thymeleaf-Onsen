package br.com.luccaprado.thymeleafonsen.controller;


import br.com.luccaprado.thymeleafonsen.model.dto.TodoItemListResponse;
import br.com.luccaprado.thymeleafonsen.model.dto.TodoItemRequest;
import br.com.luccaprado.thymeleafonsen.model.dto.TodoItemResponse;
import br.com.luccaprado.thymeleafonsen.model.entity.TodoItem;
import br.com.luccaprado.thymeleafonsen.model.mapper.TodoItemMapper;
import br.com.luccaprado.thymeleafonsen.service.TodoItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Controller
public class TodoItemController {

    private final TodoItemService todoItemService;

    private final TodoItemMapper todoItemMapper;

    @GetMapping("/")
    public ModelAndView listTodoItems() {
        List<TodoItemListResponse> todoItems = todoItemService.listTodoItems().stream().map(todoItemMapper::entityListToResponse).collect(Collectors.toList());
        ModelAndView mv = new ModelAndView("index.html");
        mv.addObject("todoItems", todoItems);
        return mv;
    }

    @PostMapping("/todo")
    public ModelAndView addTodo(@ModelAttribute TodoItemRequest todoItemRequest){
        todoItemService.createTodoItem(todoItemMapper.requestToEntity(todoItemRequest));
        List<TodoItemListResponse> todoItems = todoItemService.listTodoItems().stream().map(todoItemMapper::entityListToResponse).collect(Collectors.toList());
        ModelAndView mv = new ModelAndView("index.html");
        mv.addObject("todoItems", todoItems);
        return mv;
    }

    @GetMapping("/todo")
    public ModelAndView getAddTodo() {
        ModelAndView mv = new ModelAndView("addTodo.html");
        mv.addObject("todoItemRequest", new TodoItemRequest());
        return mv;
    }

    @GetMapping("/todo/{id}")
    public ModelAndView getTodoItem(@PathVariable("id") Long id) {
        TodoItemResponse todoItemResponse = todoItemMapper.entityToResponse(todoItemService.findById(id));
        ModelAndView mv = new ModelAndView("viewTodo.html");
        mv.addObject("todoItemResponse", todoItemResponse);
        return mv;
    }


}
