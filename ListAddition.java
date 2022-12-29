//Progrma to print the sum of two numbers given in list
package myPackage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n for 1st list");
		int n1 = sc.nextInt();
		System.out.println("Enter the elements of 1st list");
		int num1 = 0;
		for(int i = 0; i < n1; i++)
			num1 = num1 * 10 + sc.nextInt();
		System.out.println("Enter the n for 2nd list");
		int n2 = sc.nextInt();
		System.out.println("Enter the elements of 2nd list");
		int num2 = 0;
		for(int i = 0; i < n2; i++)
			num2 = num2 * 10 + sc.nextInt();
		int sum = num1 + num2;
		List<Integer> list=new ArrayList<Integer>();
		while(sum != 0) {
			list.add(sum % 10);
			sum = sum / 10;
		}
		System.out.print("Result: " + list);
	}
}
