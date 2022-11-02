import java.time.LocalDate;

public class BTodo
{
    private String name;
    private CTodo_priority priority;
    private LocalDate finishDate;
    private DTodo_category category;

    // konstruktor

    public BTodo(String name, CTodo_priority priority, DTodo_category category, LocalDate finishDate) {
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