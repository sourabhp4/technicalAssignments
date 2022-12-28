//Program for array reverse
package myPackage;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for(int i = 0; i < n/ 2; i++)
			a[i] = a[i] + a[n - i - 1] - (a[n - i - 1] = a[i]);
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

}
