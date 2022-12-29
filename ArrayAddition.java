//Program to print the sum of two numbers given in list
package myPackage;
import java.util.Scanner;
import java.util.Stack;

public class ArrayAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int num1 = 0;
			for(int i = 0; i < n1; i++)
				num1 = num1 * 10 + sc.nextInt();
			int num2 = 0;
			for(int i = 0; i < n2; i++)
				num2 = num2 * 10 + sc.nextInt();
			int sum = num1 + num2;
			Stack<Integer> stack = new Stack<>();
			while(sum != 0) {
				stack.add(sum % 10);
				sum = sum / 10;
			}
			while(! stack.empty())
				System.out.print(stack.pop() + " ");
		}
	}
}
