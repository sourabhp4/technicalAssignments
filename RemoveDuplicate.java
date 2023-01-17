//Remove duplicate elements
package myPackage;
import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int k = 0;
		for(int i = 1; i < n; i++) {
			if(a[k] != a[i]) {
				a[++k] = a[i];
			}
		}
		System.out.println("k: " + (k + 1));
		for(int i = 0; i <= k; i++)
			System.out.print(a[i] + " ");
	}

}
