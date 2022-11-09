package salt.se.jfs.todobackend.repository;

import org.springframework.stereotype.Repository;
import salt.se.jfs.todobackend.model.Todo;

import java.util.List;

@Repository
public class TodoRepository {

    MongoDbRepository repo;
    public TodoRepository(MongoDbRepository repo) {
        this.repo = repo;
    }


    public void addTodo(Todo todo){
        repo.insert(todo);
    }

    public Todo getTodo(long id){
        return repo.findById(id).orElseThrow();
    }

    public Todo saveTodo(Todo todo){
        return repo.save(todo);
    }

    public List<Todo> getAllTodos(){
        return repo.findAll();
    }

    public void deleteTodo(long id){
         repo.deleteById(id);
    }

}
