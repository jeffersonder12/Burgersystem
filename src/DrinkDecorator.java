public class DrinkDecorator extends MenuDecorator {

    protected Drink drink;

    public DrinkDecorator(Gericht gericht, Drink drink){
        super(gericht);
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        return gericht.getPrice() + drink.getPrice();
    }

    @Override
    public String getName() {
        return gericht.getName();
    }

    @Override
    public String getDescription() {
        return gericht.getDescription() + " und " +drink.getSize() + " " + drink.getName();
    }
}
