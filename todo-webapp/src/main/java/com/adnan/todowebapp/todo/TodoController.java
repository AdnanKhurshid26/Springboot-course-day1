package com.adnan.todowebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }
    
    @GetMapping("/list-todos")
    public String showTodos(ModelMap model) {

        model.put("todos", todoService.findByUsername("adnan"));

        return "list-todos";
    }

}
