interface Printer {

    void print();
}

class InkjetPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing using Inkjet Printer");
    }
}

class LaserPrinter implements Printer {
     @Override
    public void print() {
        System.out.println("Printing using Laser Printer");
    }
}

class Computer {

    Printer printer;

    Computer(Printer printer) {
        this.printer = printer;
    }

    void printDocument() {
        printer.print();
    }
}

public class PrinterApp {

    public static void main(String[] args) {

        Computer c = new Computer(new LaserPrinter());

        c.printDocument();
    }
}