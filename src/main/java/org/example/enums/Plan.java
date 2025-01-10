package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 100), // Example plan with price
    PREMIUM("Premium Plan", 200); // Add more plans if needed

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
