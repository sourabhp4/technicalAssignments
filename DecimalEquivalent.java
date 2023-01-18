//Find Decimal Equivalent of binary String
package myPackage;

public class DecimalEquivalent {
	public static void main(String[] args) {
		String b = new java.util.Scanner(System.in).next();
		int res = 0;
		for(int i = b.length() - 1; i >= 0; i--) {
			res = (int) (res + Integer.parseInt("" + b.charAt(i)) * Math.pow(2, b.length() - i - 1));
		}
		System.out.println(res);
	}
}
