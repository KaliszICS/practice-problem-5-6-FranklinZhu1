public class Smartphone {

    private Battery battery;
    private Display display;
    private Processor processor;
    private String brand, model;

    public Smartphone(String brand, String model, Battery battery, Display display, Processor processor) {
        this.brand = brand;
        this.model = model;
        this.battery = battery;
        this.display = display;
        this.processor = processor;
    }

    public Smartphone(String brand, String model, int batteryCapacity, double displaySize, String resolution, String processorModel, double processorSpeed) {
        this.brand = brand;
        this.model = model;
        this.battery = new Battery(batteryCapacity);
        this.display = new Display(displaySize, resolution);
        this.processor = new Processor(processorModel, processorSpeed);
    }

    public String powerOn() {
        if (battery.isCharged()) {
            this.display.turnOn();
            return "Powering on " + this.brand + " " + this.model;
        }
        return "Cannot power on: Battery depleted";
    }

    public String powerOff() {
        this.display.turnOff();
        return "Powering off " + this.brand + " " + this.model;
    }

    public void chargeBattery() {
        this.battery.charge();
    }

    public String runApp(String appName) {
        if (display.getOnOff()) {
            this.processor.processTask(appName);
            return appName + " running.";
        }
        return "Phone is off. Cannot run " + appName;
    }

    public void upgradeComponent(Battery newBattery) {
        this.battery = newBattery;
    }

    public void upgradeComponent(Display newDisplay) {
        this.display = newDisplay;
    }

    public void upgradeComponent(Processor newProcessor) {
        this.processor = newProcessor;
    }

    @Override
    public String toString() {
        return this.brand + " " + this.model + " Smartphone\n" + battery.toString() + "\n" + display.toString() + "\n" + processor.toString();
    }

}