/******************************************************************************
		
		                     Online Java Compiler.
		         Code, Compile, Run and Debug java program online.
		Write your code in this editor and press "Run" button to execute it.
		
		*******************************************************************************/

// Write a Java program that accepts an integer N from the user and determines whether the number is "Zero", "Even", or "Odd".
// Sample 1: 8  
// Even
// Sample 2: 15  
// Odd

// Q2.Calculate the electricity bill for U units consumed based on these tiered slabs:
// First 100 units (U <= 100): ₹1.50 per unit
// Next 100 units (101 <= U <= 200): ₹2.50 per unit
// Above 200 units (U > 200): ₹4.00 per unit
// If U < 0, output "Invalid Units".

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner user = new Scanner(System.in);

		System.out.print("enter a number to check even, odd, or zero  : ");
		int num = user.nextInt();

		if (num == 0) {
			System.out.println("zero");
		} else if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

		// 2nd

		System.out.print("enter unit you used : ");
		double U = user.nextDouble();
		double total = 0;

		if (U <= 100) {
			total = U * 1.50;
			System.out.println(total);
		} else if (101 <= U && U <= 200) {
			total = (100 * 1.50) + ((U - 100) * 2.50);
			System.out.println(total);
		} else if (U > 200) {
			total = U * 4.00;
			System.out.println(total);
		} else {
			System.out.println("try one more time");
		}

	}
}
