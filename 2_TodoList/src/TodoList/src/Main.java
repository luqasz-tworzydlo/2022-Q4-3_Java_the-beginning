
import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        Todo todo = new Todo ("spracer z psem", Todo_priority.HIGH, Todo_category.HOME, LocalDate.of(2022,10,28));

        //System.out.println(todo);

        TodoList todoList = new TodoList();

        // dodawanie
        todoList.addTodo(todo);
        todoList.addTodo(new Todo("zaprojektować system operacyjny", Todo_priority.MEDIUM, Todo_category.SCHOOL, LocalDate.of(2022,10,30)));

        // usuwanie
        todoList.removeTodo("spracer z psem");

        // wyświetlanie
        todoList.showTodos();

    }
}