package com.namrita.productApplication;

public class Product {
    private String itemName;
    private String itemDescription;
    private String itemPrice;

   Product(String name, String description, String price) {
        itemName = name;
        itemDescription = description;
        itemPrice = price;
    }
    public void printProductDescription() {
        System.out.println("----- Product Details: -----");
        System.out.println("Product Name: " + itemName);
        System.out.println("Product Description: " + itemDescription);
        System.out.println("Product Price in dollars: " + itemPrice);
    }
}
