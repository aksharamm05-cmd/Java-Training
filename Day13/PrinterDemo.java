interface PrinterDevice {
    void print();
}

class InkjetPrinter implements PrinterDevice {
      @Override
    public void print() {
        System.out.println("Printing using Inkjet Printer");
    }
}

class PrintManager {

    PrinterDevice printer;

    PrintManager(PrinterDevice printer) {
        this.printer = printer;
    }

    void startPrinting() {
        printer.print();
    }
}

public class PrinterDemo {
    public static void main(String[] args) {

        PrintManager p = new PrintManager(new InkjetPrinter());

        p.startPrinting();
    }
}
