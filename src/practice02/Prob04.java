package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
	   char[] reversechar = ( new StringBuffer(str) ).reverse().toString().toCharArray();
	   return reversechar;
	}

	public static void printCharArray(char[] array){
		System.out.println(array);
	}
}
