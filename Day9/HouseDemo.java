class Furniture {
    String name = "Sofa";
}

class Room {
    Furniture furniture = new Furniture();
}

class House {
    Room room = new Room();

    void display() {
        System.out.println("Furniture: " + room.furniture.name);
    }
}

public class HouseDemo {
    public static void main(String[] args) {
        House h = new House();
        h.display();
    }
}
