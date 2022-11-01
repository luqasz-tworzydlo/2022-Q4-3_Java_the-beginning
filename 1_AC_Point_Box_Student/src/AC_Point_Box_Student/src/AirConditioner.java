public class AirConditioner {
    // 2.2
    // 3 dane
    private int temperature;
    private int energyConsumption;
    private String brand;

    // konstruktor

    AirConditioner(int temperature, int energyConsumption, String brand) {
        // this.temperature = temperature;
        setTemperature(temperature);
        this.energyConsumption = energyConsumption;
        this.brand = brand;
    }

    public void setTemperature(int newTemperature){
        if (newTemperature>= 18 && newTemperature <= 30) {
            this.temperature = newTemperature;
        } else {
            this.temperature = 18;
        }
    }

    // funkcja string
    public  String toString() {
        return  "Brand: " + this.brand + "\nTemp: " + this.temperature;
    }
}