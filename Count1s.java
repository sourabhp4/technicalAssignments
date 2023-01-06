//Program to count1's in given binary string
package myPackage;

public class Count1s {
	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();
		int sum = 0;
		for(int i = 0; i < str.length(); i++)
			sum += (int) str.charAt(i) - '0';
		System.out.println(sum);
	}
}
