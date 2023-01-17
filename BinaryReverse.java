//Bianry String reverse
package myPackage;

public class BinaryReverse {
	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();
		char a[] = new char[32];
		for(int i = 0; i < 32; i++) {
			a[31 - i] = str.charAt(i);
		}
		System.out.println(new String(a));
	}
}
