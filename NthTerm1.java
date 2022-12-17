//Program to print Nth term of the series
package myPackage;
import java.lang.Math;

public class NthTerm1 {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		if(n > 0) {
			if(n % 2 != 0)
				System.out.println( (int) Math.pow(2, n / 2) );
			else
				System.out.println( (int) Math.pow(3, n / 2 - 1) );
		}
	}

}
