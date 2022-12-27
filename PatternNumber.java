//Program to print the pattern
package myPackage;

public class PatternNumber {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		int cnt = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i * 2 - 1; j++) {
				if(j % 2 != 0)
					System.out.print(++cnt);
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for(int i = n; i >= 1; i--) {
			cnt -= i;
			for(int j = 1; j <= i * 2 - 1; j++) {
				if(j % 2 != 0)
					System.out.print(++cnt);
				else
					System.out.print("*");
			}
			cnt -= i;
			System.out.println();
		}
	}

}
