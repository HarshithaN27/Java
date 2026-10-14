
package com.casestudy;

public class FoodOrder {

    String foodName;
    double price;
    int quantity;
    int availableStock;

    public FoodOrder(String foodName, double price,
                     int quantity, int availableStock) {
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
        this.availableStock = availableStock;
    }

    public void placeOrder() throws OutOfStockException {

        if (quantity <= 0) {
            throw new IllegalArgumentException("Invalid quantity");
        }

        checkPrice();
        checkStock();

        System.out.println("Order placed successfully!");
        calculateBill();
    }

    public void checkPrice() {
        if (price <= 0) {
            throw new IllegalArgumentException("Invalid price");
        }

        System.out.println("Price is valid");
    }

    public void checkStock() throws OutOfStockException {
        if (quantity > availableStock) {
            throw new OutOfStockException("Out of stock");
        }

        System.out.println("Stock available");
    }

    public void calculateBill() {
        double total = quantity * price;
        System.out.println("Total bill: " + total);
    }
}
