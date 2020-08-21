import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		/* get the amount of change from the customer and catch the errors using a try
		 * catch method.*/
		int change = 0;
		
		try {
			System.out.print("How much change do you have? (in cents) ");
			change = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Error: Invalid Value, must be between 0, 99 cents!");
		}
		
		
		
		
		
		
		//Process all calculations and print solutions
		int qtot = quarters(change);
		System.out.print("You are owed " + qtot + " Quarter(s),");
		change = change - (qtot * 25);
		
		
		int dtot = dimes(change);
		System.out.print( dtot + " Dime(s), ");
		change = change - (dtot * 10);
		
		
		int ntot = nickels(change);
		System.out.print( ntot + " Nickel(s), ");
		change = change - (ntot * 5);
		
		double p = change;
		int ptot = (int)p;
		System.out.println(" and " + ptot + " Penny(ies).");
		
	}
	
	// Calculate amount of Quarters needed for change
	public static int quarters(int change) {
		int	qtot = change / 25;
		return qtot;
	}
	// Calculate amount of Dimes needed for change
	public static int dimes(int change) {
		int dtot = change / 10;
		return dtot;
	}
	// Calculate amount of Nickels needed for change
	public static int nickels(int change) {
		int ntot = change / 5;
		return ntot;
	}
}
