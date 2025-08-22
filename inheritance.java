class Appliance {
    void turnOn() {
        System.out.println("Appliance is turned ON");
    }
}

class WashingMachine extends Appliance {
    void startWash() {
        System.out.println("Washing Machine started washing");
    }
}

class SmartWashingMachine extends WashingMachine {
    void connectWiFi() {
        System.out.println("Smart Washing Machine connected to WiFi");
    }
}

public class Main {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        System.out.println("Single Inheritance:");
        wm.turnOn();
        wm.startWash();

        System.out.println();

        SmartWashingMachine swm = new SmartWashingMachine();
        System.out.println("Multilevel Inheritance:");
        swm.turnOn();
        swm.startWash();
        swm.connectWiFi();
    }
}
