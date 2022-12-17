//Program to print Nth term of the series
package myPackage;

public class NthTerm2 {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		if(n > 0) {
			if(n % 2 == 0)
				System.out.println( (n - 2) / 2 );
			else
				System.out.println( n - 1 );
		}
	}
}
