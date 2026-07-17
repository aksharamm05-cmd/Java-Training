class JoinThread extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread");
    }
}

public class JoinDemo {
    public static void main(String[] args) throws Exception {
        JoinThread t = new JoinThread();
        t.start();
        t.join();
        System.out.println("Main Thread");
    }
}