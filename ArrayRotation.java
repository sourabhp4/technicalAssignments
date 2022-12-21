//Program to left shift the array
package myPackage;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = (sc.nextInt()) % n;
		int a[] = new int[n];
		int t[] = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = t[i] = sc.nextInt();
		if(d > 0) {
			for(int i = 0; i < n; i++) {
				if(i < d)
					t[n - d + i] = a[i];
				else 
					t[i - d] = a[i];
			}
		}
		for(int i = 0; i < n; i++)
			System.out.print(t[i] + " ");
	}

}
