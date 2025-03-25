package homeworkJava09;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {
	/**
	 * Cho người dùng nhập vào n số nguyên và lưu trữ trong mảng
		a. Viết hàm nhập, hàm xuất
		b. Tìm số lớn nhất và vị trí của nó trong mảng
		c. Tìm số âm đầu tiên và vị trí của nó trong mảng.
		d. Tìm số âm lớn nhất và vị trí của nó trong mảng
		e. Tính tổng các số chẵn.
		f. Đếm có bao nhiêu số âm.
		g. Tổng các số âm.
		h. Cho người dùng nhập vào x và tìm x có trong mảng đó hay không.
	 */
	
	// a. Input Array Function
	public static int[] nhapMang(Scanner scanner) {
		int n;
		System.out.println("A. Before entering values for the array, specify the array length (n) where n > 0: ");
		while (true) {
			if (scanner.hasNextInt()) {
				n = scanner.nextInt();
				if (n > 0) {
					break;
				}
				System.out.println("Error: n must be positive, re-enter n: ");
			} else {
				System.out.println("Error: Invalid input! Enter positive integer only! Re-enter n:");
				scanner.nextLine(); // consume the invalid input
			}
		}
		
		int[] arr = new int[n];
		
		System.out.println(String.format("Please enter [%d] values for the array", n));
		for (int i = 0; i < n; i++) {
			while (true) {
				if (scanner.hasNextInt()) {
					arr[i] = scanner.nextInt();
//					System.out.println(String.format("You've successfully entered [%d] numbers so far: ", i + 1));
					break;
				} else {
					System.out.println("Error: Invalid input! Re-enter a valid integer");
					scanner.nextLine(); // consume the invalid input
				}
			}
		}
		System.out.println(String.format("You've successfully entered [%d] integers for the array", n));
		return arr;
		
	}
	// a. Out Array Function
	public static void xuatMang(int[] arr, int n) {
//		for (int i = 0; i < n; i++) {
//			System.out.print(arr[i] + " ");
//		}
		System.out.println("Array elements: " + Arrays.toString(arr) + "\n");
	}
	
	// b. Tìm số lớn nhất và vị trí của nó trong mảng
	public static int findLargestNumber(int[] arr, int n) {
		if (n <= 0) {
			System.out.println("B. Error: Array length must be a positive integer!\n");
			return -1;
		}
		int maxNum = arr[0];
		int maxInd = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
				maxInd = i;
			} 	
		}
		System.out.println(String.format("B. Max number in the array is %d at index %d.\n", maxNum, maxInd));
		return maxInd;
	}
	
	// c. Tìm số âm đầu tiên và vị trí của nó trong mảng.
	public static int firstNegativeNumber(int[] arr, int n) {
		if (n <= 0) {
			System.out.println("C. Error: Array length must be a positive integer!\n");
			return -1;
		}
		
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				System.out.println(String.format("C. Found! The first negative number is %d at index %d \n", arr[i], i));
				return i;
			} 	
		}
		
		System.out.println("C. There is no negative number in the array!\n");
		return -1; // Return -1 if no negative number is found 
	}
	
	// d. Tìm số âm lớn nhất và vị trí của nó trong mảng
	public static int largestNegativeNumber(int[] arr, int n) {
		if (n <= 0) {
			System.out.println("D. Error: Array length must be a positive integer!\n");
			return -1;
		}
		int largestNeg = 0;
		int negInd = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				if (arr[i] < 0 && arr[i] > largestNeg) {
					largestNeg = arr[i];
					negInd = i;
				}
			} 	
		}
		if(negInd == -1) {
			System.out.println("D. There is no negative number in the array!\n");
			 return -1; // Return -1 if no negative number is found 
		}
		System.out.println(String.format("D. The largest negative number in the array is %d at index %d.\n", largestNeg, negInd));
		return negInd;
		
	}
	
	// e. Tính tổng các số chẵn.
	public static int sumEven(int[] arr, int n) {
		if (n <= 0) {
			System.out.println("E. Error: Array length must be a positive integer!\n");
			return -1;
		}
		int sum = 0; // Edge case is when there are a mix of odd and even number that are both negative and positves
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (!isOdd(arr[i])) {
				sum += arr[i];
				count++;
			}
		}
		if (count > 0) {
			System.out.println("E. Sum of even numbers: " + sum + "\n");
			return sum;
		}
		System.out.println("E. There are no even numbers!\n");
		return -1;
	}
	
	// f. Đếm có bao nhiêu số âm.
	public static int countNegative(int[] arr, int n) { 
		if (n <= 0) {
			System.out.println("F. Error: Array length must be a positive integer!\n");
			return -1;
		}
		int count = 0;
		for (int num : arr) {
			if (num < 0) {
				count++;
			}
		}
		
		System.out.println(String.format("F. There are a total of %d negative numbers.\n", count));
		return count;
		
	}
	
	// g. Tổng các số âm.
	public static int sumNegative(int[] arr, int n) {
		if (n <= 0) {
			System.out.println("G. Error: Array length must be a positive integer!\n");
			return -1;
		}
		int sum = 0;
		for (int num : arr) {
			if (num < 0) {
				sum += num;
			}
		}
		if (sum < 0) {
			System.out.println("G. Sum of all negative numbers: " + sum + "\n");
			return sum;
		}
		System.out.println("G. There are no negative numbers.\n");
		return 0;
	}
	
	// h. Cho người dùng nhập vào x và tìm x có trong mảng đó hay không.
	public static boolean findNum(int[] arr, int n, Scanner scanner) { 
		int input;
		System.out.println("H. Enter the number you are looking for: ");
		while (true) {
			if (scanner.hasNextInt()) {
				input = scanner.nextInt();
				break;
			} else {
				System.out.println("H. Error: Invalid input! Enter an integer only! Re-enter:");
				scanner.nextLine(); // consume the invalid input
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == input) {
				System.out.println(String.format("Found %d at index %d.\n", arr[i], i ));
				return true;
			}
		}
		System.out.println("Number not found in the array.\n");
		return false;
	}
	
	public static boolean isOdd(int num) {
		 return num % 2 != 0;
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// a. Viết hàm nhập, hàm xuất
		int[] userArr = nhapMang(scanner);
		final int N = userArr.length;
		xuatMang(userArr, N);
		// b. Tìm số lớn nhất và vị trí của nó trong mảng
		findLargestNumber(userArr, N);
		// c. Tìm số âm đầu tiên và vị trí của nó trong mảng.
		firstNegativeNumber(userArr, N);
		// d. Tìm số âm lớn nhất và vị trí của nó trong mảng
		largestNegativeNumber(userArr, N);
		// e. Tính tổng các số chẵn.
		sumEven(userArr, N);
		// f. Đếm có bao nhiêu số âm.
		countNegative(userArr, N);
		// g. Tổng các số âm.
		sumNegative(userArr, N);
		// h. Cho người dùng nhập vào x và tìm x có trong mảng đó hay không.
		findNum(userArr, N, scanner);
		scanner.close();
	}

}
