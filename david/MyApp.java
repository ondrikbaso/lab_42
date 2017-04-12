package lab42;

import java.util.Scanner;

public class main {
	
	public static int changeBalance(int newValue) {
		
	   return newValue;
		}
	
	public static int changePrice(int newPrice) {
		System.out.println("enter price:");

	   return newPrice;
		}
	
    public static void main(String[] args) { 
    	Product product = new Product("Edam", 3.3, 120);
    	
    	Scanner input = new Scanner (System.in);
    	
    	int newValue = 0;
    	System.out.println("enter balance:");
    	if (input.hasNextInt()) {
			newValue = input.nextInt();
			}
    	else {
    		System.out.println("invalid input");
    		System.exit(0);
    	}
    	
    	product.amount=changeBalance(newValue);
    	
    	System.out.println("enter price:");
    	if (input.hasNextInt()) {
			newValue = input.nextInt();
			}
    	else {
    		System.out.println("invalid input");
    		System.exit(0);
    	}
    	product.price=changePrice(newValue);
    
    	System.out.println("Product value is " + product.countValue());
    	product.printProduct();
     }
	
}

 class Product {
	private String name;
	double price;
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