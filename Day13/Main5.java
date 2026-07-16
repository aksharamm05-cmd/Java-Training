class Animal {
    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat");
    }
}

public class Main5 {
    public static void main(String[] args) {
        Animal[] a = {new Dog(), new Cat()};

        for (Animal x : a)
            x.sound();
    }
}
