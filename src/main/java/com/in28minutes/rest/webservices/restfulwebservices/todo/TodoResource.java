package com.in28minutes.rest.webservices.restfulwebservices.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {
    TodoService todoService;

    @Autowired
    public TodoResource(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/users/{userName}/todos")
    public List<Todo> retrieveTodos(@PathVariable String userName){
        return todoService.findByUserName(userName);
    }

    @GetMapping("/users/{userName}/todos/{id}")
    public Todo retrieveTodo(@PathVariable String userName, @PathVariable int id){
        return todoService.findByUserName(userName).stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    @DeleteMapping("/users/{userName}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String userName, @PathVariable int id){
        todoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/users/{userName}/todos/{id}")
    public ResponseEntity<Void> updateTodo(@PathVariable String userName, @PathVariable int id, @RequestBody Todo todo){
        todoService.updateTodo(todo);
       return ResponseEntity.noContent().build();
    }

    @PostMapping("/users/{userName}/todos")
    public Todo createTodo(@PathVariable String userName, @RequestBody Todo todo){
        System.out.println(todo);
        return todoService.addTodo(userName, todo.getDescription(), todo.getTargetDate(), todo.isDone());
    }
}
