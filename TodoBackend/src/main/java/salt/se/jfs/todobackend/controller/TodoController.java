package salt.se.jfs.todobackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import salt.se.jfs.todobackend.model.TodoDTO;
import salt.se.jfs.todobackend.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/todos")
    ResponseEntity<TodoDTO> addTodo(@RequestBody TodoDTO todoDTO){
        TodoDTO dto = todoService.addTodo(todoDTO);
        return ResponseEntity.ok(dto);

    }

    @GetMapping("/todos")
    ResponseEntity<List<TodoDTO>> getAllTodos(){
        List<TodoDTO> todoDTOList = todoService.getAllTodos();
        return ResponseEntity.ok(todoDTOList);
    }


    @GetMapping("/todos/{todoId}")
    ResponseEntity<TodoDTO> getTodo(@PathVariable long todoId){
        TodoDTO dto = todoService.getTodo(todoId);
        return ResponseEntity.ok(dto);
    }

    @PutMapping("/todos/{todoId}")
    ResponseEntity<TodoDTO> updateTodo(@PathVariable long todoId){
        TodoDTO dto = todoService.updateTodo(todoId);
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("/todos/{todoId}")
    ResponseEntity<Void> deleteTodo(@PathVariable long todoId){
        todoService.deleteTodo(todoId);
        return ResponseEntity.noContent().build();
    }
}
