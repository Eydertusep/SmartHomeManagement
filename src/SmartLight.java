public class SmartLight extends SmartDevice {

    private int brightness;
    private String color;

    public SmartLight(String brand, String model, String status, String color, int level) {
        super(brand, model, status);
        this.color = color;

    }


    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public void setAdjustBrightness(int level) {
        if (level >= 0 && level < 101) {
            this.brightness = level;
        } else {
            if (level < 0) {
                System.out.println(" el brillo es negativo ");
            } else {
                System.out.println(" El brillo supera el 100% ");
            }
        }
    }

    public void getJustBrightness() {
        System.out.println(" Brightness: " + brightness);
    }

    public void deviceInfo () {
        System.out.println("Brand: " + brand + " Model: " + model + " Status: " + status + " Color: " + color);
        };
    }
