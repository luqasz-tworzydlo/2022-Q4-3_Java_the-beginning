import java.util.ArrayList;

public class ETodoList
{
    private ArrayList<BTodo> todos;

    ETodoList(){
        this.todos = new ArrayList();
    }

    public void addTodo(BTodo todo){
        todos.add(todo);
    }

    public void removeTodo(String name){
        todos.removeIf((todo) -> todo.getName() == name);
    }

    public void showTodos(){
        for(BTodo todo: todos){
            System.out.println(todo);
        }
    }
}

