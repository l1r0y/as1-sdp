public class DrinkCreator {

    interface Coffee {
        String getCoffeeName();
    }

    static class EspressoLatte implements Coffee {
        @Override
        public String getCoffeeName() {
            return "Espresso Latte";
        }
    }

    static class EspressoCappuccino implements Coffee {
        @Override
        public String getCoffeeName() {
            return "Espresso Cappuccino";
        }
    }

    interface DrinkCreatorInterface {
        Coffee createDrink();
    }

    static class LatteCreator implements DrinkCreatorInterface {
        @Override
        public Coffee createDrink() {
            return new EspressoLatte();
        }
    }

    static class CappuccinoCreator implements DrinkCreatorInterface {
        @Override
        public Coffee createDrink() {
            return new EspressoCappuccino();
        }
    }
}