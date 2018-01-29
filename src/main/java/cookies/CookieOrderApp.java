package cookies;

import java.util.Scanner;

public class CookieOrderApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MasterOrder myOrder = new MasterOrder();
		myOrder.addOrder(new CookieOrder("Tagalongs",1));
		myOrder.addOrder(new CookieOrder("Samoas",6));
		myOrder.addOrder(new CookieOrder("Thin Mints",3));
		System.out.println(myOrder.getTotalBoxes());
		myOrder.showOrder();
		System.out.println("What would you like to remove?(variety or none)");
		String toRemove = input.nextLine();
		System.out.println("You are choosing to remove " + toRemove);
		myOrder.removeVariety(toRemove);
		System.out.println("Current order:");
		myOrder.showOrder();
	
	}

}
