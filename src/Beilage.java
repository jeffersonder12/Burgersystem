public abstract class Beilage implements Gericht {

    protected Gericht gericht;

    public Beilage(Gericht gericht){
        this.gericht = gericht;
    }


    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void getBeschreibung() {

    }
}
