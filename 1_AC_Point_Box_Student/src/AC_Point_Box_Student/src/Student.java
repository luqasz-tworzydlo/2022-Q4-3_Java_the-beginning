public class Student {
    // 5.2
    private String surname;
    private double grade1, grade2;

    /*public Student(String surname, double grade1, double grade2) {
        this.surname = surname;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }*/
    public Student(String surname, double grade1, double grade2) {
        this.surname = surname;
        setGrade(grade1, grade2);
    }

    // [b]
    public void setGrade(double grade1) {
        if (grade1 >= 1 && grade1 <= 6) {
            this.grade1 = grade1;
        }
        else
        {
            this.grade1 = 3;
        }
    }

    // [c]
    public void setGrade(double grade1, double grade2){
        setGrade(grade1);
        if (grade2 >= 1 && grade2 <= 6) {
            this.grade2 = grade2;
        }
        else
        {
            this.grade2 = 3;
        }
    }

    public double average(){
        return(this.grade1 + this.grade2) / 2;
    }

    public String toString() {
        return "Student1\n=> surname='" + surname + "'" +
                "\n=> grade1=" + grade1 +
                "\n=> grade2=" + grade2;
    }
}