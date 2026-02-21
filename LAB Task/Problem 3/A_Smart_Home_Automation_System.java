// Base Class
class Device {
    int deviceId;

    // Constructor
    Device(int deviceId) {
        this.deviceId = deviceId;
    }

    // Method
    void operate() {
        System.out.println("Operating generic device");
    }
}

// Intermediate Class
class Appliance extends Device {
    double powerConsumption;

    // Constructor
    Appliance(int deviceId, double powerConsumption) {
        super(deviceId);
        this.powerConsumption = powerConsumption;
    }

    // Overriding method
    @Override
    void operate() {
        System.out.println("Operating appliance with power consumption: " 
                           + powerConsumption + "W");
    }
}

// Derived Class
class SmartAppliance extends Appliance {
    boolean wifiEnabled;

    // Constructor
    SmartAppliance(int deviceId, double powerConsumption, boolean wifiEnabled) {
        super(deviceId, powerConsumption);
        this.wifiEnabled = wifiEnabled;
    }

    // Overriding method
    @Override
    void operate() {
        super.operate();  // Call parent method
        System.out.println("Smart features enabled: " + wifiEnabled);
    }
}

// Runtime Polymorphism Class
class HomeController {

    void controlDevice(Device d) {
        d.operate();   // Polymorphism
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Create SmartAppliance object
        Device device = new SmartAppliance(101, 1500.5, true);

        // Create HomeController
        HomeController controller = new HomeController();

        // Control device
        controller.controlDevice(device);
    }
}
