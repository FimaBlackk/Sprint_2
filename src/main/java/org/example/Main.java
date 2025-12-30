import model.Apple;
import model.Food;
import model.Meat;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100.0);
        Apple redApples = new Apple(10, 50.0, model.constants.Colour.RED);
        Apple greenApples = new Apple(8, 60.0, model.constants.Colour.GREEN);

        Food[] products = {meat, redApples, greenApples};

        service.ShoppingCart cart = new service.ShoppingCart(products);

        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWithoutDiscount() + " руб.");
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("Сумма вегетарианских продуктов без скидки: " +
                cart.getVegetarianTotalPriceWithoutDiscount() + " руб.");
    }
}
