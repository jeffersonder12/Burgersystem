public abstract class MenuDecorator implements Gericht{

    protected Gericht gericht;

    public MenuDecorator(Gericht gericht){
        this.gericht = gericht;
    }
}
