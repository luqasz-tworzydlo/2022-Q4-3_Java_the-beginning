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
        Point XY = new Point(5,7);
        System.out.println(XY);
        XY.ResetPoint(5,7);
        System.out.println(XY);
        XY.MovePoint(5,7);
        System.out.println(XY);
    }
}