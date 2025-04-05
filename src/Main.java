public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        SmartLight hue = new SmartLight("Philips", "Hue", "ON", "white", 30);
        SmartThermostat nest = new SmartThermostat("Nest", "T3007ES", "ON", 22);
        hue.turnOn();
        nest.turnOn();

        hue.deviceInfo();
        hue.setAdjustBrightness(75);
        System.out.println(" Brightness:" + hue.getJustBrightness());

        nest.deviceInfo();
        System.out.println(nest.getTemperature() + "°C");
        hue.changeColor("Blue");
        System.out.println("Hue color changed to: " + hue.getColor());
        hue.setAdjustBrightness(50);
        System.out.println("Hue brightness set to: " + hue.getJustBrightness());
        nest.setTemperature(25);
        System.out.println("T3007ES temperature set to " + nest.getTemperature() + "°C");
        nest.increaseTemperature();
        System.out.println("T3007ES temperature set to " + nest.getTemperature() + "°C");










    }
}