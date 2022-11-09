package salt.se.jfs.todobackend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
public class Todo {
    public void setDone(boolean done) {
        isDone = done;
    }

    @Id
    @MongoId
    int id;
    String title;
    String description;
    boolean isDone;

    public Todo(TodoDTO dto) {
        this.id = dto.id();
        this.title = dto.title();
        this.description = dto.description();
        this.isDone = dto.isDone();
    }

    public Todo(){

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }
}
