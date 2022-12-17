//V pattern program 2
package myPackage;

public class AlphabetPattern2 {
	public static void main(String args[]) {
		int len = new java.util.Scanner(System.in).nextInt();
		char c[] = new char[len];
		for(int i = 0; i < len; i++)
			c[i] = (char)('A' + i);
		int index = 0;
		for(int i = 0; i < len; i++) {
			if(i == len - 1)
				System.out.println(" ".repeat(i) + c[index]);
			else
				System.out.println(" ".repeat(i) + c[index] + " ".repeat((len - i) * 2 - 3) + c[index++]);
		}
	}
}
