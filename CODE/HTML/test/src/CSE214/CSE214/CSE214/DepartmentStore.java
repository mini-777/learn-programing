package CSE214;

import java.util.Scanner;

public class DepartmentStore extends ItemList{
	


	public static void main(String[] args) {
		String input;
		Scanner stdin = new Scanner(System.in);
		ItemList newNode = new ItemList();
	
	
	
	System.out.println("Welcome!\n");
	System.out.println("C - Clean Store");
	System.out.println("L - List by location");
	System.out.println("M - Move an item in the store");
	System.out.println("O - Checkout");
	System.out.println("P - Print all items in store");
	System.out.println("R - Print by RFID tag number");
	System.out.println("U - Update inventory system");
	
	
	do {
		System.out.print("Please select an option: ");
		input = stdin.nextLine().toUpperCase();
		switch(input) {

			case "C":
				newNode.cleanStroe();
				System.out.println("\nThe following item(s) have been moved back to their" + " original locations: \n");
				System.out.println(newNode.toString());
				break;

			case "I":
				System.out.print("Enter the name: ");
				String products = stdin.nextLine();
				System.out.print("Enter the RFID: ");
				String rfid = stdin.nextLine();
				System.out.print("Enter the original location");
				String originalLocation = stdin.nextLine();
				System.out.print("Enter the price: ");
				double price = stdin.nextDouble();
				newNode.insertInfo(products, rfid, price, originalLocation);
				break;

			case "L":
				System.out.print("Enter the location");
				String location = stdin.nextLine();
				newNode.printByLocation(location);
				break;
				
			case "M" : 
				System.out.print("Enter the RFID: ");
				rfid = stdin.nextLine();
				System.out.print("Enter the original location: ");
				originalLocation = stdin.nextLine();
				System.out.print("Enter the new location: ");
				String newLocation = stdin.nextLine();
				newNode.moveItem(rfid, originalLocation, newLocation);
				break;

			case "O":
				System.out.print("Enter the cart number: ");
				String cartNumber = stdin.nextLine();
				newNode.checkOut(cartNumber);
				break;

			case "P":
				newNode.printAll();
				break;

			case "U":
				System.out.println("The following item(s) have removed from the system: \n");
				newNode.removeAllPurchased();
				break;

			case "Q":
				System.out.println("Goodbye!");

			}
		} while (input.equals("Q"));
		stdin.close();

	}

}

