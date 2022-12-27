//Program to sort and remove redundants
package myPackage;
import java.util.Arrays;
import java.util.Scanner;

public class SortRemoveRedundant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int d, cnt = 1;
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		for(int i = 1; i < n; i++)
			if(a[i - 1] != a[i])
				a[cnt++] = a[i];
		for(int i = 0; i < cnt; i++)
			System.out.print(a[i] + " ");
	}

}
