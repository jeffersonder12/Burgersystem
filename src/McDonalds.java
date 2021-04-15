import java.util.ArrayList;

public class McDonalds {

    private ArrayList<Burger> burgers = new ArrayList<>();
    private ArrayList<Drink> drinks = new ArrayList<>();

    public void start(){
        System.out.println("Unsere Burger:");
       Burger burger = new Burger("Cheesburger", 4.5);
       Burger burger1 = new Burger("DoubleMcBacon", 5.60);

       burgers.add(burger);
       burgers.add(burger1);

       for(int i = 0; i < burgers.size(); i++){
       for (Burger b : burgers){
           System.out.println(i + "\t" + b.getName());
           System.out.println("\t" + b.getPrice() + "\n");
       }}

        System.out.println("Unsere Drinks: ");
       Drink drink = new Drink("Cola", "small", 4.5);
       Drink drink1 = new Drink("Sprite", "large", 5.5);

       drinks.add(drink);
       drinks.add(drink1);

       for (Drink d : drinks){
           System.out.println("\t" + d.getName());
           System.out.println("\t" + d.getSize());
           System.out.println("\t" + d.getPrice() + "\n");
       }
    }
}
