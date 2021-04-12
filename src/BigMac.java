public class BigMac implements Gericht{
    @Override
    public double getPrice() {
        //System.out.println("\tPreis: 7.90\n");
        return 7.90;
    }

    @Override
    public void getBeschreibung() {
        System.out.println("\tBigMac");
    }
}
