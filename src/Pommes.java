public class Pommes extends Beilage{

    public Pommes(Gericht gericht) {
        super(gericht);
    }

    public void getBeschreibung(){
        System.out.println("\tPommes");
    }


    public double getPrice(){
        //System.out.println("\tPreis: 2.50");
        return 2.50;
    }
}
