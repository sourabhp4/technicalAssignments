//Find Majority element
package myPackage;
import java.util.Scanner;
import java.util.Arrays;

public class Majority {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		int cnt = 1, ele = a[0];
		for(int i = 0; i < n - 1; i++) {
			if(a[i] == a[i + 1]) {
				ele = a[i];
				cnt++;
				continue;
			}
			cnt = 1;
		}
		if(cnt > n / 2) {
			System.out.println(ele);
		}
	}
}
