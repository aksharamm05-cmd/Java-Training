interface Notification {
    void send();
}

class Email implements Notification {
    @Override
    public void send() {
        System.out.println("Email Notification");
    }
}

class SMS implements Notification {
    @Override
    public void send() {
        System.out.println("SMS Notification");
    }
}

class Push implements Notification {
    @Override
    public void send() {
        System.out.println("Push Notification");
    }
}

public class NotificationApp {
    public static void main(String[] args) {

        Notification n;

        n = new Email();
        n.send();

        n = new SMS();
        n.send();

        n = new Push();
        n.send();
    }
}
