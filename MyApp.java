package lab42;

import java.util.Scanner;

public class main {
	
	public static int changeBalance(int newValue) {
		System.out.println("enter balance:");

	   return newValue;
		}
	
    public static void main(String[] args) { 
    	Product product = new Product("Edam", 3.3, 120);
    	
    	Scanner input = new Scanner (System.in);
    	
    	int newValue = 0;
    	if (input.hasNextInt()) {
			newValue = input.nextInt();
			}
    	product.amount=changeBalance(newValue);
    	System.out.println("Product value is " + product.countValue());
    	product.printProduct();
     }

}

 class Product {
	private String name;
	private double price;
	int amount; //Amount in storage
	public Product(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	public double countValue() {
		return(amount * price);
	}
	
	
 
	public void printProduct() {
		System.out.printf("Product %s, price %4.1f and balance %d pcs", name,price,amount);
	}
}

