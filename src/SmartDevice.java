public abstract class SmartDevice {
    String brand;
    String model;
    String status;

    //constructor
    public SmartDevice(String brand, String model, String status) {
        this.brand = brand;
        this.model = model;
        this.status = status;
    }
    //metodos
    public void turnOn() {
        System.out.println("Encender el dispositivo");
    }
    public void turnOff() {
        System.out.println("Encender el dispositivo");
    }
    public abstract void deviceInfo();
}
