public enum CTodo_priority
{
    HIGH ("wysoki priorytet"),
    LOW ("niski priorytet"),
    MEDIUM ("średni priorytet");

    private final String Todo_priorityTXT;

    private CTodo_priority(String Todo_priorityTXT){
        this.Todo_priorityTXT = Todo_priorityTXT;
    }

    public String getTodo_priority(){
        return Todo_priorityTXT;
    }
}