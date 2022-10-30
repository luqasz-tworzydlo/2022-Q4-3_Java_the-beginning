import java.time.LocalDate;

public class Todo
{
    private String name;
    private Todo_priority priority;
    private LocalDate finishDate;
    private Todo_category category;

    // konstruktor

    public Todo(String name, Todo_priority priority, Todo_category category, LocalDate finishDate) {
        this.name = name;
        this.priority = priority;
        this.category = category;
        this.finishDate = finishDate;
    }

    // getter

    public String getName() {
        return name;
    }

    // metoda toString

    public String toString() {
        return "zadanie: " + name + "\n -> " + priority.getTodo_priority() + "\n -> " + category.getTodo_category() + "\n -> " + finishDate;
    }
}