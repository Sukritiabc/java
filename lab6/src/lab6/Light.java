package lab6;

public class Light {
	public static void main(String[] args) {
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        bulb1.turnOn();
        bulb3.turnOn();
        
        System.out.println("Is bulb1 on? " + bulb1.isOn());
        System.out.println("Is bulb2 on? " + bulb2.isOn());
        System.out.println("Is bulb3 on? " + bulb3.isOn());
      
        bulb2.turnOff();
    
        System.out.println("Is bulb1 on? " + bulb1.isOn());
        System.out.println("Is bulb2 on? " + bulb2.isOn());
        System.out.println("Is bulb3 on? " + bulb3.isOn());
    }
}
