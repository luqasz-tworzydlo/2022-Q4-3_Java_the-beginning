import java.util.Scanner;

import static java.lang.System.in;

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
        Scanner sc = new Scanner(in);
        String data = sc.nextLine();
        System.out.println(data);

        Student student = new Student("Avri",245,2324);
        System.out.println(student);

        double result = student.average();
        System.out.println("=> średnia ocen: " + result);

        student.setGrade((40));
        System.out.println(student);
    }
}