class Restaurant {
    String name = "ABC Restaurant";
}

class Food {
    Restaurant restaurant;

    Food(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    void prepare() {
        System.out.println("Food prepared by " + restaurant.name);
    }
}

class Pizza extends Food {
    Pizza(Restaurant r) {
        super(r);
    }

    @Override
    void prepare() {
        System.out.println("Pizza delivered from " + restaurant.name);
    }
}

class Burger extends Food {
    Burger(Restaurant r) {
        super(r);
    }

    @Override
    void prepare() {
        System.out.println("Burger delivered from " + restaurant.name);
    }
}

public class FoodDelivery {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Food f;

        f = new Pizza(r);
        f.prepare();

        f = new Burger(r);
        f.prepare();
    }
}
