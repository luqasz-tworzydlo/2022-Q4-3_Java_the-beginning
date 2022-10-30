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

    // metoda toString

    public String toString() {
        String priorityTXT = "";
        switch (priority){
            case LOW -> priorityTXT = "niski priorytet";
            case HIGH -> priorityTXT = "wysoki priorytet";
            case MEDIUM -> priorityTXT = "średni priorytet";
            default -> priorityTXT = "";
        }
        String categoryTXT = "";
        switch (category){
            case JOB -> categoryTXT = "kategoria: praca";
            case HOME -> categoryTXT = "kategoria: dom";
            case HEALTH -> categoryTXT = "kategoria: zdrowie";
            case SCHOOL -> categoryTXT = "kategoria: szkoła";
        }

        return name + "\n -> " + priorityTXT + "\n -> " + categoryTXT + "\n -> " + finishDate;
    }
}