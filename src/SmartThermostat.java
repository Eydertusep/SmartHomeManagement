public class SmartThermostat extends SmartDevice {
    private double temperature;

    public SmartThermostat(String brand, String model, String status, double temperature) {
        super(brand, model, status);
        this.temperature = temperature;

    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        if (temperature<10 || temperature>30){
            System.out.println("La temperatura está fuera del rango, debe ser mayor de 10° y menor de 30°");
        }
        else {

            this.temperature = temperature;
        }
    }

    public void increaseTemperature(){
        temperature +=1;
    }

    public void decreaseTemperature(){
        temperature -=1;
    }

    public void isEnergySavingMode(){
        if (temperature>10 && temperature <20){
            System.out.println("El termostato se encuentra en modo ahorro de energía");
        } else {
            System.out.println(" modo ahorro de energia esta apagado ");
        }
    }

        public void deviceInfo() {
            System.out.println("SmartThermostat - Brand: " + brand + ", Model: " + model + ", Status: " + status);
        }
    }

