public class DrinkDecorator extends MenuDecorator {

    protected Drink drink;

    public DrinkDecorator(Gericht gericht, Drink drink){
        super(gericht);
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        return drink.getPrice();
    }

    @Override
    public String getName() {
        return gericht.getName();
    }

    @Override
    public String getDescription() {
        return drink.getSize() + " " + drink.getName();
    }
}
