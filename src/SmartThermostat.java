public class SmartThermostat extends SmartDevice {
   private double temperature;

   public SmartThermostat(String brand, String model, String status, double temperature){
       super (brand,model,status);
       this.temperature=temperature;
   }




public void deviceInfo(){
       System.out.println("SmartThermostat - Brand: )" + brand + ", Model: " + model + ", Status: " + status);
}
}
