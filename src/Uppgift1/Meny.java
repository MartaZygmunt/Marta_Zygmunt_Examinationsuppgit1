package Uppgift1;
import java.util.ArrayList;


public class Meny {
    public static void main(String[] args) {

        ArrayList<Dish> meny = new ArrayList<>();

        Dish dish1 = new Dish("Meatballs in tomato sauce", 145.49, "Meat",560 );
        Dish dish2 =new Dish( "Pork in mushroom sauce", 123.25, "Meat",356);

        Dish dish3 = new Dish( "Vegetable curry", 140.00, "Vegetarian", 230);
        Dish dish4 = new Dish( "Bean Burger", 140.89, "Vegetarian", 230);

        Dish dish5 = new Dish( "Vegan burrito", 129.99, "Vegan", 230);
        Dish dish6 = new Dish( "Vegan lentil soup", 156.66, "Vegan", 230);

        meny.add(dish1);
        meny.add(dish2);
        meny.add(dish3);
        meny.add(dish4);
        meny.add(dish5);
        meny.add(dish6);

        System.out.println("******************************");
        System.out.println(      "Today's lunch menu"    );
        System.out.println("******************************");

        for (Dish dish : meny) {
            System.out.println("Dish: " + dish.name);
            System.out.println("Typ: " + dish.type);
            System.out.println("Pris : " + dish.price + " sek");
            System.out.println("Calories: " + dish.calories + " kcal");
            System.out.println("******************************");
        }
    }
}