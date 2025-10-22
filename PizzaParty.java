import java.util.ArrayList;
import java.util.Random;


public class PizzaParty {
    static int dough = 0;
    static int pepperoni = 0;
    static int cheese = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Pizza Hut!");

        if (dough == 0 || pepperoni == 0 || cheese == 0) {
            restock();
        }

        String[] menu = {"Cheese", "Pepperoni", "Meat Lovers", "Hawaiian"};

        ArrayList<String> customers = new ArrayList<String>();
        customers.add("Andy");
        customers.add("Ezra");
        customers.add("Ethan");

        for (int i = customers.size() - 1; i != -1; i--) {
            Random random = new Random();
            int randomIndex = random.nextInt(menu.length);
            String randomOrder = menu[randomIndex];

            createPizza(randomOrder);

            System.out.println(randomOrder + " pizza for " + customers.get(i) + "!");
        }

    }

    public static void restock() {
        dough += 10;
        pepperoni += 10;
        cheese += 10;
    }

    public static void createPizza(String pizzaType) {
        switch (pizzaType) {
            case "Cheese":
                cheese -= 2;
                dough -= 2;
                break;
            case "Pepperoni", "Meat Lovers", "Hawaiian":
                cheese -= 2;
                dough -= 2;
                pepperoni -= 2;
                break;
            default:
                System.out.println("Pizza not recognized!");
                break;

        }
    }
}