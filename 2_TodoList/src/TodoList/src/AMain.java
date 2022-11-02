
import java.time.LocalDate;

public class AMain {
    public static void main(String[] args)
    {
        BTodo todo = new BTodo("spracer z psem", CTodo_priority.HIGH, DTodo_category.HOME, LocalDate.of(2022,10,28));

        //System.out.println(todo);

        ETodoList todoList = new ETodoList();

        // dodawanie
        todoList.addTodo(todo);
        todoList.addTodo(new BTodo("zaprojektować system operacyjny", CTodo_priority.MEDIUM, DTodo_category.SCHOOL, LocalDate.of(2022,10,30)));

        // usuwanie
        todoList.removeTodo("spracer z psem");

        // wyświetlanie
        todoList.showTodos();

    }
}