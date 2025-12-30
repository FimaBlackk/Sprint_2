package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double itemPrice = item.getAmount() * item.getPrice();
            double discount = item.getDiscount() / 100; // в долях
            total += itemPrice * (1 - discount);
        }
        return total;
    }

    public double getVegetarianTotalPriceWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}
