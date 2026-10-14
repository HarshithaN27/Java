package com.casestudy;

public class Main {
    public static void main (String[]args){
        FoodOrder order = new FoodOrder("Pizza", 200, 2, 10);
        try {
            order.placeOrder();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Food ordering process completed");
        }
    }
}

