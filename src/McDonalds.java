import java.util.ArrayList;
import java.util.Scanner;

public class McDonalds {

    private ArrayList<Burger> burgers = new ArrayList<>();
    private ArrayList<Drink> drinks = new ArrayList<>();
    Scanner scan;

    public void start(){
        System.out.println("Unsere Burger:");
       Burger burger = new Burger("Cheeseburger", 4.5);
       Burger burger1 = new Burger("DoubleMcBacon", 5.60);

       burgers.add(burger);
       burgers.add(burger1);

       for (Burger b : burgers){
           System.out.println((burgers.indexOf(b) + 1)+ "\t" + b.getName());
           System.out.println("\t" + "CHF " + b.getPrice() + "\n");
       }

        System.out.println("Unsere Drinks: ");
       Drink drink = new Drink("Cola", "small", 4.5);
       Drink drink1 = new Drink("Sprite", "large", 5.5);

       drinks.add(drink);
       drinks.add(drink1);

       for (Drink d : drinks){
           System.out.println((drinks.indexOf(d) + 1) +"\t" + d.getName());
           System.out.println("\t" + d.getSize());
           System.out.println("\t" + "CHF " + d.getPrice() + "\n");
       }

        System.out.println("Geben Sie die Zahl des Burgers an: ");
       int decision = scan.nextInt();
    }

    public void decision(){

    }
}
