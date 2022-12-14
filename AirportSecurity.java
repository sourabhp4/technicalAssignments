//Program for AirportSecurity
import java.util.Arrays;
import java.util.Scanner;

public class AirportSecurity {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int c1 = 0, c2 = 0;
		for(int  i = 0; i < n; i++) {
			int b = sc.nextInt();
			switch(b) {
			case 1: c1++;
					break;
			case 2: c2++;
			}
		}
		System.out.println("0 ".repeat(n - (c1 + c2)) + "1 ".repeat(c1) + "2 ".repeat(c2));
	}
}
