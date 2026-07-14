class CPU {
    String brand = "Intel";
}

class Computer {

    CPU cpu = new CPU();

    void display() {
        System.out.println("CPU Brand: " + cpu.brand);
    }
}

public class ComputerDemo {
    public static void main(String[] args) {

        Computer c = new Computer();
        c.display();
    }
}
