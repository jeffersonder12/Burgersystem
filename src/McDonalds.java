import java.util.ArrayList;
import java.util.Scanner;
public class McDonalds {

    private ArrayList<Burger> burgers = new ArrayList<>();
    private ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<Burger> bestellung = new ArrayList<>();
    int decision;
    int decisiond;
    Burger b;
    Drink d;
    Scanner scan = new Scanner(System.in);
    String mehr="Y";
    public void start(){


        System.out.println("Unsere Burger:");
        Burger burger = new Burger("Cheeseburger", 4.5);
        Burger burger1 = new Burger("DoubleMcBacon", 5.60);
        burgers.add(burger);
        burgers.add(burger1);
        while(mehr.equalsIgnoreCase("Y")) {
            for (Burger b : burgers) {
                System.out.println((burgers.indexOf(b) + 1) + "\t" + b.getName());
                System.out.println("\t" + "CHF " + b.getPrice() + "\n");
            }
            try {
                System.out.println("Geben Sie die Zahl des Burgers an: ");
                decision = scan.nextInt();
                b = burgers.get((decision - 1));
                bestellung.add(b);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Diese Nummer ist nicht vorhanden, bitte wählen Sie eine gütlige Nummer.");
                decision = scan.nextInt();
                b = burgers.get((decision - 1));
            }
            System.out.println("Wollen Sie mehr Burger bestellen? [Y/N]:");
            mehr = scan.next();
        }

        System.out.println("Mit Getränk? Y/N");
        String yesNo = scan.next();
        if(yesNo.equalsIgnoreCase("Y")) {
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

            try {
                System.out.println("Geben Sie die Nummer des Getränks an: ");
                decisiond = scan.nextInt();
                d = drinks.get((decisiond - 1));
            }catch (IndexOutOfBoundsException e){
                System.out.println("Diese Nummer ist nicht vorhanden, bitte wählen Sie eine gütlige Nummer.");
                decisiond = scan.nextInt();
                d = drinks.get((decisiond - 1));
            }
            bestellübersichtMitGetränk(b, d);
        }
        else{

            for(Burger i:bestellung) {
                bestellübersichtOhneGetränk(i);
            }
        }
    }
    public void bestellübersichtMitGetränk(Burger burger, Drink drink){
        CustomMenu menu = new CustomMenu("Ihre Bestellung: ");
        BurgerDecorator burgerDecorator = new BurgerDecorator(menu, burger);
        DrinkDecorator drinkDecorator = new DrinkDecorator(burgerDecorator, drink);
        System.out.println(drinkDecorator.getName());
        System.out.println(drinkDecorator.getDescription());
        System.out.println(drinkDecorator.getPrice() + " Franken");
    }
    public void bestellübersichtOhneGetränk(Burger burger){
        CustomMenu menu = new CustomMenu("Ihr Burger: ");
        BurgerDecorator burgerDecorator = new BurgerDecorator(menu, burger);
        System.out.println(burgerDecorator.getName());
        System.out.println(burgerDecorator.getDescription());
        System.out.println(burgerDecorator.getPrice() + " Franken");
    }
}