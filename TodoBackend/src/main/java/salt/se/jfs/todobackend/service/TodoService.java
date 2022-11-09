package salt.se.jfs.todobackend.service;

import org.springframework.stereotype.Service;
import salt.se.jfs.todobackend.model.Todo;
import salt.se.jfs.todobackend.model.TodoDTO;
import salt.se.jfs.todobackend.repository.TodoRepository;

import java.util.List;

@Service
public class TodoService {

    TodoRepository todoRepo;
    public TodoService(TodoRepository todoRepo){
        this.todoRepo = todoRepo;
    }

    public TodoDTO addTodo(TodoDTO todoDTO){
        Todo todo = new Todo(todoDTO);
        todoRepo.addTodo(todo);
        return todoDTO;
    }

    public TodoDTO getTodo(long id){
        return new TodoDTO(todoRepo.getTodo(id));
    }

    public List<TodoDTO> getAllTodos(){
        return todoRepo.getAllTodos().stream()
                .map(TodoDTO::new)
                .toList();
    }

    public TodoDTO updateTodo(long id){
        Todo updatedTodo = todoRepo.getTodo(id);
        updatedTodo.setDone(!updatedTodo.isDone());
        return new TodoDTO(todoRepo.saveTodo(updatedTodo));
    }

    public void deleteTodo(long id){
        todoRepo.deleteTodo(id);
    }



}
