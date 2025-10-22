public class ObjectPractice {
    class Main {
        public static void main(String[] args) {
            LemonadeStand.makeLemonade();
            LemonadeStand.makeLemonade();
            LemonadeStand.makeLemonade();
            LemonadeStand.checkInventory();
        }

    }
    class LemonadeStand {
        public static void makeLemonade() {
            Inventory.lemons -=  1;
            Inventory.water -= 1;
            Inventory.sugar -= 1;
        }

        public static void checkInventory() {
            System.out.println("Lemons: " + Inventory.lemons);
            System.out.println("Water: " + Inventory.lemons);
            System.out.println("Sugar: " + Inventory.lemons);
        }
    }
    // Continued
    class Inventory {
        public static int lemons = 10;
        public static int water = 10;
        public static int sugar = 10;
    }
}
