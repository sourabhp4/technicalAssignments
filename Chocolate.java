//Program for Chocolate Factory
import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int index1 = 0;
		for(int i = 0; i < n; i++) {
			int in = sc.nextInt();
			if(in != 0)
				a[index1++] = in;
		}
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

}
