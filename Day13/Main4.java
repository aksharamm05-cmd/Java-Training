class Animal {
  
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}

public class Main4{
    public static void main(String[] args) {
        new Dog().sound();
        new Cat().sound();
    }
}
