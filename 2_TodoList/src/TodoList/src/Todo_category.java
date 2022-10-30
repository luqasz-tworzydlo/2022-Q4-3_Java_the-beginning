public enum Todo_category
{
    SCHOOL ("szkoła"),
    HOME ("dom"),
    HEALTH ("zdrowie"),
    JOB ("praca");

    private final String Todo_categoryTXT;

    private Todo_category(String Todo_categoryTXT){
        this.Todo_categoryTXT = Todo_categoryTXT;
    }

    public String getTodo_category(){
        return Todo_categoryTXT;
    }
}