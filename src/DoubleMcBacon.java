public class DoubleMcBacon implements Gericht{
    @Override
    public double getPrice() {
        //System.out.println("\tPreis: 6.80\n");
        return 6.8;
    }

    @Override
    public void getBeschreibung() {
        System.out.println("\tDoubleMcBacon");
    }

}
