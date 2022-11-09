package salt.se.jfs.todobackend.model;

public record TodoDTO(
        int id,
        String title,
        String description,
        boolean isDone) {
    public TodoDTO(Todo todo){
        this(todo.getId(), todo.getTitle(), todo.getDescription(), todo.isDone());
    }
}
