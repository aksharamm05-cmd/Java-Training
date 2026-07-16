class Food {
    void order() {
        System.out.println("Food Ordered");
    }
}

class Pizza extends Food {
    @Override
    void order() {
        System.out.println("Pizza Delivered");
    }
}

public class FoodDelivery {
    Food f;

    FoodDelivery(Food f) {
        this.f = f;
    }

    void display() {
        f.order();
    }

    public static void main(String[] args) {
        FoodDelivery fd = new FoodDelivery(new Pizza());
        fd.display();
    }
}