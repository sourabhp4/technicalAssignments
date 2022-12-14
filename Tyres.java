//Program to find no. of vehicles
import java.util.Scanner;

public class Tyres {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int w = sc.nextInt();
		if(w < 2 || w % 2 != 0 || w <= v) {
			System.out.println("INVALID INPUT");
			return;
		}
		int fw = (w - 2 * v) / 2;
		int tw = v - fw;
		System.out.println(tw + " " + fw);
	}
}
