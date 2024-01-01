/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		
		int minBorder = Math.min (Integer.parseInt(args[0]),Integer.parseInt(args[1])) ; 
		int maxBorder = Math.max (Integer.parseInt(args[0]),Integer.parseInt(args[1])) ;
		int range = maxBorder - minBorder ;

		int a =(int)( Math.random()*range ) + minBorder ;
		int b =(int)( Math.random()*range ) + minBorder ;
		int c =(int)( Math.random()*range ) + minBorder ;

		System.out.println(a) ; 	
		System.out.println(b) ; 
		System.out.println(c) ; 

		/*
		#Feedback:
   		Generally you can use the same variable and override it after finding the first minimum.
     		However, if you choose to use 2 different variables, it's better to give a meaningful name which is not temp.
		('temp' is always bad name!)
		I might use something like: minAB & minAll
		*/
		int minNum = Math.min(a,b) ;
		minNum = Math.min(minNum,c);

		System.out.println("The minimal generated number was " + minNum) ; 	
	}
}
