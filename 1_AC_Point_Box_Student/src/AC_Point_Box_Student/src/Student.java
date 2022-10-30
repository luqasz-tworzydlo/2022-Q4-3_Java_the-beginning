public class Student {
    // 5.2
    private String Surname;
    private int Grade1, Grade2;

    public Student(String surname, int grade1, int grade2) {
        Surname = surname;
        Grade1 = grade1;
        Grade2 = grade2;
    }

    public String toString() {
        return "Student Surname='" + Surname +
                "\n, Grade1=" + Grade1 +
                "\n, Grade2=" + Grade2 +
                '}';
    }
}