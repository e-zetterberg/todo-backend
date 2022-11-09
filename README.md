# todo-backend

REST-api for a TodoList, using MongoDB running as a docker-container.
Port:8080
Endpoints:
/api/todos
GET - list all Todos
POST - creates and saves new Todo from a JSON-object

/api/todos/{todoId}
GET - get Todo with id {todoId}
PUT - change isDone from true to false and vice versa. returns the updated Todo
DELETE - deletes Todo with id {todoId}

To run it, you'll need: 
docker

