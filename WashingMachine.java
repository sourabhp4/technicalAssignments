//Program for Washing Machine

public class WashingMachine {
	public static void main(String args[]) {
		int w = new java.util.Scanner(System.in).nextInt();
		if(w < 0)
			System.out.println("Invalid Input");
		else if(w == 0)
			System.out.println("Time Estimated: 0 minutes");
		else if(w <= 2000)
			System.out.println("Time Estimated: 25 minutes");
		else if(w <= 4000)
			System.out.println("Time Estimated: 35 minutes");
		else if(w <= 7000)
			System.out.println("Time Estimated: 45 minutes");
		else
			System.out.println("Overloaded");
	}
}
