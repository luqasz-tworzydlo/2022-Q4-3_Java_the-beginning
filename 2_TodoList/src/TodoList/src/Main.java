import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        Todo todo = new Todo ("spracer z psem", Todo_priority.HIGH, Todo_category.HOME, LocalDate.of(2022,10,28));

        System.out.println(todo);

    }
}