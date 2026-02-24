package com.example;

public class Product {

    private String id;
    private String name;
    private double price;
    private int stock;

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product() {
    this("id-por-defecto", "producto-sin-nombre", 0.0, 0);
}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0.0;  
        } else {
            this.price = price;
        }
    }


    public double getPrice() {
        return price;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            this.stock = 0;
        } else {
            this.stock = stock;
        }
    }


    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Producto: \nID: " + id + "\nNombre: " + name + "\nPrecio: " + price + "\nStock: " + stock;
    }

}
