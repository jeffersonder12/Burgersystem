public class CustomMenu implements Gericht{

    String name;

    public CustomMenu(String name){
        this.name = name;
    }

    @Override
    public double getPrice() {
        return 5;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return "Menu";
    }
}
