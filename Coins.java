/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		
		int cents =  Integer.parseInt(args[0]) ;
		int quarters = cents/25 ;
		int remainder = cents%25 ;

		System.out.println("Use " + quarters +  " quarters and " + remainder + " cents"); 
	}
}
