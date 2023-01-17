//Merging two lists
package myPackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListMerge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		for(int i = 0; i < n1 + n2; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
