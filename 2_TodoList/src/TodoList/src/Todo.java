import java.time.LocalDate;

public class Todo
{
    private String name;
    private Todo_priority priority;
    private final LocalDate finishDate;
    private Todo_category category;

    // konstruktor

    public Todo(String name, Todo_priority priority, LocalDate finishDate, Todo_category category) {
        this.name = name;
        this.priority = priority;
        this.finishDate = finishDate;
        this.category = category;
    }

    // metoda toString

    public String toString() {
        return "=> trzeba zrobić " + name +
                ", którego priorytet jest " + priority +
                ",\ngdzie trzeba to skończyć do " + finishDate +
                "oraz którego kategoria to " + category;
    }
}