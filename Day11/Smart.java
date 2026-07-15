interface RemoteControl {
    void operate();
}

abstract class Appliance {
    abstract void turnOn();
}

class Fan extends Appliance implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Fan is ON");
    }
    @Override
    public void operate() {
        System.out.println("Operating Fan using Remote");
    }
}

class Light extends Appliance implements RemoteControl {
       @Override
    public void turnOn() {
        System.out.println("Light is ON");
    }
         @Override
    public void operate() {
        System.out.println("Operating Light using Remote");
    }
}

public class Smart {

    public static void main(String[] args) {

        Appliance a;

        a = new Fan();
        a.turnOn();

        RemoteControl r = new Fan();
        r.operate();

        System.out.println();

        a = new Light();
        a.turnOn();

        r = new Light();
        r.operate();
    }
}
