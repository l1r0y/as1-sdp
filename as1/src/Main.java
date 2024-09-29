public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Экземпляр кафе через Singleton
        CafeManager cafeManager = CafeManager.getInstance();

        // Фабричный метод для создания Латте
        DrinkCreator.LatteCreator latteCreator = new DrinkCreator.LatteCreator();
        DrinkCreator.Coffee latte = latteCreator.createDrink();

        // Абстрактная фабрика для ингредиентов Латте
        IngredientFactory latteIngredients = new LatteIngredientFactory();
        IngredientProvider.Milk milk = latteIngredients.createMilk();
        IngredientProvider.Syrup syrup = latteIngredients.createSyrup();

        // Создание заказа с помощью Builder
        OrderPrototype customLatte = new CustomCoffeeBuilder()
                .selectCoffee(latte)
                .addMilk(milk)
                .addSyrup(syrup)
                .build();

        // Размещение заказа в кафе
        cafeManager.placeOrder(customLatte);

        // Клонирование заказа
        OrderPrototype clonedOrder = customLatte.clone();
        cafeManager.placeOrder(clonedOrder);

        // Создание Капучино с другой фабрикой ингредиентов
        DrinkCreator.CappuccinoCreator cappuccinoCreator = new DrinkCreator.CappuccinoCreator();
        DrinkCreator.Coffee cappuccino = cappuccinoCreator.createDrink();
        IngredientFactory cappuccinoIngredients = new CappuccinoIngredientFactory();
        IngredientProvider.Milk cappuccinoMilk = cappuccinoIngredients.createMilk();
        IngredientProvider.Syrup cappuccinoSyrup = cappuccinoIngredients.createSyrup();

        // Создание заказа Капучино
        OrderPrototype customCappuccino = new CustomCoffeeBuilder()
                .selectCoffee(cappuccino)
                .addMilk(cappuccinoMilk)
                .addSyrup(cappuccinoSyrup)
                .build();

        cafeManager.placeOrder(customCappuccino);

        System.out.println("Active orders: " + cafeManager.getActiveOrders());
    }
}