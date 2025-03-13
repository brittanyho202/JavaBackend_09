package homeworkJava09;

import java.util.Scanner;

public class Homework1 {
	// Question 1:
	public static double hypotenuse(int side1, int side2) {
		// Assuming both sides of the triangle are integers
		return Math.sqrt(side1*side1 + side2*side2);
	}
	
	// Question 2:
	public static double px (double a, int n) {
		/**
		 *  P(x) = ax^n
		 *  x = 8 (provided)
		 *  n is non negative integer
		 */
		int x = 8;
		return n < 0? -1 : (a * Math.pow(x, n)); 
	}
	
	// Question 3:
	public static int digitsSum(int num) {
		// takes a two-digit positive integer n as input --> the sum of its two digits.
		if (num <= 0 || (String.valueOf(num)).length() != 2) { // n > 0 and have 2 digits
			return -1;
		}
		return num / 10 + num % 10; // example: 23 = 20 + 3; 23/10=2 (int), 23%10 = 3
	}
	
	// Question 4:
	public static double average(Scanner scanner) {
		/**
		 * Requirements:
		 * 1. five numbers as input (use constant) from console
		 * 2. use a variable to accumulate the sum of these numbers.
		 * 3. use +=
		 * 4. divide the sum by 5 to compute the average (integer division and type casting!)
		 */
		final int COUNT = 5;
		int sum = 0;
		System.out.println("Enter " + COUNT + " numbers:");
		
		for (int i = 0; i < COUNT; i++) {
			System.out.printf("Vui long nhap so nguyen thu %d : ", i+1);
			sum += scanner.nextInt();
		}
		
		// sum is an integer
		double ave = (double) sum / COUNT;
		System.out.println("Gia tri trung binh cua 5 so tren: " + ave);
		return ave;	
	}
	
	// Question 5:
	public static double temperatureConversion(Scanner scanner) {
		// F = (C * 1.8) + 32
		System.out.println("Enter a temperature value in C to be converted (e.g. 21): ");
		double input = scanner.nextDouble();
		double tempF = (input * 1.8) + 32;
		System.out.println(input + " degree celsius = " + tempF + " degree fahrenheit");
		return tempF;
		
	}
	
	// Question 6:
	public static double CurrencyConverter(Scanner scanner) {
		final double EXCHANGE_RATE = 23500.0; // VND per USD
   
        // Input USD amount
        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();
        
        // Convert to VND
        double vnd = usd * EXCHANGE_RATE;

        System.out.printf("%.2f USD = %.0f VND\n", usd, vnd);
        return vnd;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dap an Q1: " + hypotenuse(3, 4) + "\n"); // answer = 5.0
		
		System.out.println("Dap an Q2:");
		System.out.println("\tTest case 1: " + px(2, 3)); // answer = 1024.0
		System.out.println("\tTest case 2: " + px(4, -2)); // answer = -1
		System.out.println("\tTest case 3: " + px(0.3, 7) + "\n"); // answer = 629145.6
		
		System.out.println("Dap an Q3:");
		System.out.println("\tTest case 1: " + digitsSum(91)); // answer = 10
		System.out.println("\tTest case 2: " + digitsSum(23)); // answer = 5
		System.out.println("\tTest case 3: " + digitsSum(-20)); // answer = -1
		System.out.println("\tTest case 4: " + digitsSum(300)+ "\n"); // answer = -1
		
		System.out.println("Dap an Q4:");
		average(scanner);
		
		System.out.println("\nDap an Q5:");
		temperatureConversion(scanner);
		
		System.out.println("\nDap an Q6:");
		CurrencyConverter(scanner);
		
		scanner.close();
	
		
	}

}
