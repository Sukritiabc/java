package lab6;

public class Bulb {
	private boolean isOn;

    // Constructor
    public Bulb() {
        this.isOn = false; // By default, the bulb is off
    }

    // Method to turn on the bulb
    public void turnOn() {
        this.isOn = true;
        System.out.println("The bulb is now on.");
    }

    // Method to turn off the bulb
    public void turnOff() {
        this.isOn = false;
        System.out.println("The bulb is now off.");
    }

    // Method to check if the bulb is on
    public boolean isOn() {
        return isOn;
    }

}
