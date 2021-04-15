import java.util.ArrayList;
import java.util.Scanner;

public class McDonalds {

    private ArrayList<Burger> burgers = new ArrayList<>();
    private ArrayList<Drink> drinks = new ArrayList<>();
    int decision;
    int decisiond;
    Scanner scan = new Scanner(System.in);

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

        System.out.println("Geben Sie die Zahl des Burgers an: ");
        decision = scan.nextInt();

        System.out.println("Mit Getränk? Y/N");
        String yesNo = scan.next();

        if(yesNo.equals("Y")) {

            System.out.println("Unsere Drinks: ");
            Drink drink = new Drink("Cola", "small", 4.5);
            Drink drink1 = new Drink("Sprite", "large", 5.5);

            drinks.add(drink);
            drinks.add(drink1);

            for (Drink d : drinks) {
                System.out.println((drinks.indexOf(d) + 1) + "\t" + d.getName());
                System.out.println("\t" + d.getSize());
                System.out.println("\t" + "CHF " + d.getPrice() + "\n");
            }

            System.out.println("Geben Sie die Nummer des Getränks an: ");
            decisiond = scan.nextInt();
        }
            Burger b = burgers.get((decision -1));
            Drink d = drinks.get((decisiond - 1));

            CustomMenu menu = new CustomMenu("Bestellung");
            BurgerDecorator burgerDecorator = new BurgerDecorator(menu, b);
            DrinkDecorator drinkDecorator = new DrinkDecorator(burgerDecorator, d);

        System.out.println(drinkDecorator.getName());
        System.out.println(drinkDecorator.getDescription());
        System.out.println(drinkDecorator.getPrice());


    }
}
