class FirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("First Thread");
    }
}

class SecondThread extends Thread {
    @Override
    public void run() {
        System.out.println("Second Thread");
    }
}

public class TwoThread {
    public static void main(String[] args) {
        new FirstThread().start();
        new SecondThread().start();
    }
}