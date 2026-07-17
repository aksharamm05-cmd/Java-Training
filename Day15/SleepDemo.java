class SleepThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class SleepDemo {
    public static void main(String[] args) {
        new SleepThread().start();
    }
}
