//Program to find the length of last word
package myPackage;
import java.util.Scanner;

public class StringWordLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = 0;
		String str = sc.nextLine();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ')
				len = 0;
			else
				len++;
		}
		System.out.println(len);
	}
}
