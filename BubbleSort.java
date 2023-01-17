//Bubble Sort
package myPackage;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int swaps = 0;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(a[j] > a[j + 1]) {
					a[j] = a[j] + a[j + 1] - (a[j + 1] = a[j]);
					swaps++;
				}
			}
		}
		System.out.println("Array is sorted in " + swaps + " swpas");
		System.out.println("First element is: " + a[0]);
		System.out.println("Last element is: " + a[n - 1]);
		
	}
}
