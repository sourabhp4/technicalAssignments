//Program to find the sum of the series
package myPackage;

public class SeriesSum {

	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		double fact = 1, result = 0;
		for(int i = 1; i <= num; i ++) {
			fact *= i;
			if(i % 2 == 0)
				result -= (i / fact);
			else
				result += (i / fact);
			System.out.println(fact + " " + result);
		}
		System.out.println(result);
	}

}
