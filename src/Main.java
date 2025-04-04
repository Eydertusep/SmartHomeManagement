public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        SmartLight hue = new SmartLight("Philips", "Hue", "ON", "white", 30);
        SmartThermostat nest = new SmartThermostat("Nest", "T3007ES", "ON", 22);
        hue.turnOn();
        nest.turnOn();

        hue.deviceInfo();
        hue.setAdjustBrightness(75);
        hue.getJustBrightness();

        nest.deviceInfo();
        nest.




    }
}