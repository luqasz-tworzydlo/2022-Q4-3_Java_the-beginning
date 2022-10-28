public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        AirConditioner ac = new AirConditioner( 6456670, 1000, "Electrolux");
        System.out.println(ac);
        ac.setTemperature((37));
        // System.out.println(ac.toString());
        System.out.println(ac);
    }
}