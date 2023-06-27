package application;

import entities.products;

import java.util.Locale;
import java.util.Scanner;
public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        products product = new products();
        System.out.println("Enter product data: ");
    System.out.print("Name: ");
    product.name = sc.nextLine();
    System.out.print("Price: ");
    product.price = sc.nextDouble();
    System.out.print("Quantity in Stock: ");
    product.quantity = sc.nextInt();

        System.out.println("Enter Product Data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in Stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated Data: " + product);
        System.out.print("Enter the number of products to be removed in Stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated Data: " + product);
sc.close();
}
}
