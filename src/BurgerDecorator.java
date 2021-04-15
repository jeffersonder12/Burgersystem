public class BurgerDecorator extends MenuDecorator{

    protected Burger burger;

    public BurgerDecorator(Gericht gericht, Burger burger) {
        super(gericht);
        this.burger = burger;
    }

    @Override
    public double getPrice() {
        return gericht.getPrice() + burger.getPrice();
    }

    @Override
    public String getName() {
        return gericht.getName();
    }

    @Override
    public String getDescription() {
        return gericht.getDescription() + " mit "+burger.getName();
    }
}
