package com.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creando productos...");
        System.out.println("-------------------");
        System.out.println("Producto 1:");
        Product producto1 = new Product("001", "Laptop", 999.99, 10);
        producto1.setPrice(1050.00);
        System.out.println("Precio actualizado de producto1: " + producto1.getPrice());
        System.out.println("Producto 2:");
        Product producto2 = new Product("002", "Smartphone", 499.99, 20);
        producto2.setStock(25);
        System.out.println("Stock actualizado de producto2: " + producto2.getStock());
        System.out.println("Producto 3:");
        Product producto3 = new Product("003", "Tablet", 299.99, 15);
        producto3.setName("Tablet Pro");
        System.out.println("Nombre actualizado de producto3: " + producto3.getName());
        System.out.println("Producto 4:");
        Product producto4 = new Product();
        System.out.println("Producto4 - ID: " + producto4.getId() + ", Name: " + producto4.getName() + ", Price: " + producto4.getPrice() + ", Stock: " + producto4.getStock());

        System.out.println("Detalles de los productos:");
        System.out.println(producto1.toString());
        System.out.println(producto2.toString());
        System.out.println(producto3.toString());
        System.out.println(producto4.toString());

    }
}