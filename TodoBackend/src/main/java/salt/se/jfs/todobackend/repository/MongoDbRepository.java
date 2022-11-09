package salt.se.jfs.todobackend.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import salt.se.jfs.todobackend.model.Todo;

public interface MongoDbRepository extends MongoRepository<Todo, Long> {

}
