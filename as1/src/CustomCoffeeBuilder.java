public class CustomCoffeeBuilder {
    private DrinkCreator.Coffee coffee;
    private IngredientProvider.Milk milk;
    private IngredientProvider.Syrup syrup;

    public CustomCoffeeBuilder selectCoffee(DrinkCreator.Coffee coffee) {
        this.coffee = coffee;
        return this;
    }

    public CustomCoffeeBuilder addMilk(IngredientProvider.Milk milk) {
        this.milk = milk;
        return this;
    }

    public CustomCoffeeBuilder addSyrup(IngredientProvider.Syrup syrup) {
        this.syrup = syrup;
        return this;
    }

    // Создание заказа
    public OrderPrototype build() {
        return new OrderPrototype(coffee, milk, syrup);
    }
}