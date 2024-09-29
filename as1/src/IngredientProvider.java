public class IngredientProvider {

    interface Milk {
        String getMilkType();
    }

    interface Syrup {
        String getSyrupType();
    }

    // Конкретные классы для ингредиентов
    static class WholeMilk implements Milk {
        @Override
        public String getMilkType() {
            return "Whole Milk";
        }
    }

    static class AlmondMilk implements Milk {
        @Override
        public String getMilkType() {
            return "Almond Milk";
        }
    }

    static class VanillaSyrup implements Syrup {
        @Override
        public String getSyrupType() {
            return "Vanilla Syrup";
        }
    }

    static class CaramelSyrup implements Syrup {
        @Override
        public String getSyrupType() {
            return "Caramel Syrup";
        }
    }
}