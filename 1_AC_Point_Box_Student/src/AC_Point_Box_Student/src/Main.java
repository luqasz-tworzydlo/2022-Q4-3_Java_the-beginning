import java.util.Scanner;

import static java.lang.System.in;

/*
Zasady pisania w Java
   1. Każda klasa w osobnym pliku. Klasy (i pliki) dużą literą
   2. Pola, zmienne, metody - małą literą
   3. Angielski... (Point, nie Punkt itd.)
*/

public class Main {
    public static void main(String[] args) {
        // 1.1
        // System.out.println("Hello world!");

        // 2.1
        /*AirConditioner ac = new AirConditioner( 6456670, 1000, "Electrolux");
        System.out.println(ac);
        ac.setTemperature((37));
        // System.out.println(ac.toString());
        System.out.println(ac);*/

        // 3.1
        /*Point point = new Point(46,-19);
        System.out.println(point);
        *//*point.ResetPoint();
        System.out.println(point);*//*
        point.MovePoint(-10,40);
        System.out.println(point);*/

        // useful shortcut (!!!)
        // sout + tab => System.out.println();

        // 4.1
        /*Box box = new Box (34,13,91);
        System.out.println(box);
        int result = box.Volume();
        System.out.println("objętość pudełka wynosi: " + result);*/

        // 5.1 [a]
        /*Student student = new Student("Avri",5,4);
        System.out.println(student);
        double result = student.average();
        System.out.println("=> średnia ocen: " + result);*/
        // 5.1 [b]
        /*student.setGrade((26));
        System.out.println(student);*/
        // 5.1 [c]
        /*Student student = new Student("Avri",245,2324);
        System.out.println(student);
        student.setGrade((40));
        System.out.println(student);*/
        // 5.1 [d]
        /*Scanner sc = new Scanner(in);
        System.out.println("Podaj nazwisko studenta: ");
        String surname = sc.nextLine();
        System.out.println("Podaj pierwszą ocenę studenta: ");
        String grade1 = sc.nextLine();
        System.out.println("Podaj drugą ocenę studenta: ");
        String grade2 = sc.nextLine();
        Student student = new Student(surname, Double.parseDouble(grade1), Double.parseDouble(grade2));
        System.out.println(student);
        double result = student.average();
        System.out.println("=> średnia ocen: " + result);*/
        // 5.1 [e]
        String end = "nie";
        while (end.equals("nie")) {
            Scanner sc = new Scanner(in);

            System.out.println("Podaj nazwisko studenta: ");
            String surname = sc.nextLine();

            System.out.println("Podaj pierwszą ocenę studenta: ");
            String grade1 = sc.nextLine();

            System.out.println("Podaj drugą ocenę studenta: ");
            String grade2 = sc.nextLine();

            Student student = new Student(surname, Double.parseDouble(grade1), Double.parseDouble(grade2));
            System.out.println(student);

            double result = student.average();
            System.out.println("=> średnia ocen: " + result);

            System.out.println("czy już koniec? tak/nie");
            end = sc.nextLine();
        }
        System.out.println("\nDziękujemy za korzystanie z naszej aplikacji");
    }
}