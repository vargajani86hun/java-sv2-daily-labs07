package day05;

import java.time.LocalDate;

public class Product {
    private String name;
    private int price;
    private LocalDate saleDate;

    public Product(String name, int price, LocalDate saleDate) {
        this.name = name;
        this.price = price;
        this.saleDate = saleDate;
    }

    public boolean isValidDate() {
        return saleDate.compareTo(LocalDate.now()) <= 0;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }
}
