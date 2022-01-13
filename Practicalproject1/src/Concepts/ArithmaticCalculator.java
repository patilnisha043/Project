package Concepts;

import java.util.Scanner;

public class ArithmaticCalculator {

	public static void main(String[] args) {
		int first;
		int second;
		int add;
		int subtract;
		int multiply;             
		float divide;
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Enter Two Numbers:");
		first=Scanner.nextInt();
		second=Scanner.nextInt();
		
		add=first+second;
		subtract=first-second;
		multiply=first*second;
		divide=(float) first/second;
		
		System.out.println("sum="+add);
		System.out.println("subtract="+subtract);
		System.out.println("Multiplication="+multiply);
		System.out.println("Division="+divide);
		
	    
		
		

	}

}
