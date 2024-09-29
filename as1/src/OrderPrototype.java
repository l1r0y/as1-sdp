public class OrderPrototype implements Cloneable {
    private DrinkCreator.Coffee coffee;
    private IngredientProvider.Milk milk;
    private IngredientProvider.Syrup syrup;

    public OrderPrototype(DrinkCreator.Coffee coffee, IngredientProvider.Milk milk, IngredientProvider.Syrup syrup) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
    }

    public String getCoffeeName() {
        return coffee.getCoffeeName() + " with " + milk.getMilkType() + " and " + syrup.getSyrupType();
    }

    @Override
    protected OrderPrototype clone() throws CloneNotSupportedException {
        return (OrderPrototype) super.clone();
    }
}