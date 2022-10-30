import java.util.ArrayList;

public class TodoList
{
    private ArrayList<Todo> todos;

    TodoList(){
        this.todos = new ArrayList();
    }

    public void addTodo(Todo todo){
        todos.add(todo);
    }

    public void removeTodo(String name){
        todos.removeIf((todo) -> todo.getName() == name);
    }

    public void showTodos(){
        for(Todo todo: todos){
            System.out.println(todo);
        }
    }
}

