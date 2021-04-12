import java.util.Scanner;

public class UserInterface implements Gericht{

    Gericht gericht;
    Gericht gericht2;
    Gericht gericht3;
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void getBeschreibung() {

    }

    public void welcome(){
        System.out.println("Herzlich Willkommen");
        System.out.println("===================\n");
        menuBurger();
        decision();
    }
    public void menuBurger(){
        System.out.println("Unsere Burger: ");
        gericht = new BigMac();
        gericht2 = new DoubleMcBacon();
        gericht.getBeschreibung();
        gericht.getPrice();
        gericht2.getBeschreibung();
        gericht2.getPrice();



    }

    public void decision(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Namen des Burgers ein: ");
        String name = scan.next();
        System.out.println("Wollen Sie eine Beilage dazu? Y/N");
        String decision = scan.next();
        if(decision.equalsIgnoreCase("Y")){
            System.out.println("Unsere Beilagen: ");
            if(name.equals("BigMac")){
                gericht3 = new Pommes(new BigMac());
                gericht3.getBeschreibung();
                gericht3.getPrice();
            }
            else if(name.equals("DoubleMcBacon")){
                gericht3 = new Pommes(new DoubleMcBacon());
                gericht3.getBeschreibung();
                gericht3.getPrice();
            }
            System.out.println("Bitte wählen Sie eine Beilage: ");
            String beilage = scan.next();
            System.out.println("Ihre Bestellung: ");
            double price = gericht.getPrice() + gericht3.getPrice();
            System.out.println("\t"+name + " mit "+ beilage + " "+ price +"CHF");
        }
    }




}
