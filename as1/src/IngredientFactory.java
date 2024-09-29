interface IngredientFactory {
    IngredientProvider.Milk createMilk();
    IngredientProvider.Syrup createSyrup();
}

class LatteIngredientFactory implements IngredientFactory {
    public IngredientProvider.Milk createMilk() {
        return new IngredientProvider.WholeMilk();
    }

    public IngredientProvider.Syrup createSyrup() {
        return new IngredientProvider.VanillaSyrup();
    }
}

class CappuccinoIngredientFactory implements IngredientFactory {
    public IngredientProvider.Milk createMilk() {
        return new IngredientProvider.AlmondMilk();
    }

    public IngredientProvider.Syrup createSyrup() {
        return new IngredientProvider.CaramelSyrup();
    }
}