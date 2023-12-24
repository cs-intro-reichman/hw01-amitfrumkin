/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		
		int minBorder = Math.min (Integer.parseInt(args[0]),Integer.parseInt(args[1])) ; 
		int maxBorder = Math.max (Integer.parseInt(args[0]),Integer.parseInt(args[1])) ;
		int range = maxBorder - minBorder ;

		int a =(int)( Math.random()*range + 1) + minBorder ;
		int b =(int)( Math.random()*range + 1) + minBorder ;
		int c =(int)( Math.random()*range + 1) + minBorder ;

		System.out.println(a) ; 	
		System.out.println(b) ; 
		System.out.println(c) ; 

		int minNumTemp = Math.min(a,b) ;
		int minNum = Math.min(minNumTemp,c) ;

		System.out.println("the minimal generated number was:" + minNum) ; 	
	}
}
