class PriorityThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
}

public class PriorityDemo {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}