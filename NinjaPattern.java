//Ninja pattern
package myPackage;

public class NinjaPattern {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		int cnt = 1;
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				if(n % 2 == 0)
					System.out.println(" *".repeat(n - 1));
				else
					System.out.println("* ".repeat(n));
				break;
			}
			if(i % 2 == 0) {
				System.out.println("* ".repeat(cnt) + " ".repeat(((n - 1) * 2) - 2 - (i * 2)) + "* ".repeat(cnt));
			}
			else
				System.out.println(" *".repeat(cnt) + " ".repeat(((n - 1) * 2) - 1 - (i * 2)) + "* ".repeat(cnt++));
		}
		if(n % 2 != 0) {
			cnt --;
		}
		for(int i = n - 2; i >=0; i--) {
			if(i % 2 == 0) {
				System.out.println("* ".repeat(cnt) + " ".repeat(((n - 1) * 2) - 2 - (i * 2)) + "* ".repeat(cnt--));
			}
			else
				System.out.println(" *".repeat(cnt) + " ".repeat(((n - 1) * 2) - 1 - (i * 2)) + "* ".repeat(cnt));
		}
	}
}
