//Program for pairing socks
import java.util.Arrays;
import java.util.Scanner;

public class Socks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int i = 0;
		System.out.println("Enter values");
		int ar[] = new int[n];
		for(i = 0; i < n; i++)
			ar[i] = sc.nextInt();
		Arrays.sort(ar);
		int count = 0;
		for(i = 0; i < n - 1; i ++) {
			if(ar[i] != ar[i + 1])
				count++;
			else
				i++;
		}
		if(i == n - 1)
			count++;
		System.out.println(count);
	}

}
