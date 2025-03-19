package homeworkJava09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Homework2 {
	static Scanner scanner = new Scanner(System.in);
	/**
	 * Question 1: Viết chương trình nhập vào 2 số nguyên m, n. Xác định và xuất số nguyên lớn nhất.
	 */
	public static int maxOfTwo() {
		System.out.println("*****Question 1*****\nPlease input the 1st integer:");
		int firstInt = scanner.nextInt();
		System.out.println("Please input the 2nd integer:");
		int secondInt = scanner.nextInt();
		
		int max;
		if (firstInt > secondInt) {
			System.out.println(String.format("The 1st number [%d] is the largest!\n", firstInt));
			max = firstInt;
		} else if (firstInt < secondInt) {
			System.out.println(String.format("The 2nd number [%d] is the largest!\n", secondInt));
			max = secondInt;
		} else {
			System.out.println("Both numbers are equal!\n");
			max = firstInt;
		}
		return max;
	}

	/**
	 * Question 2: Cho người dùng nhập vào 3 số nguyên, viết chương trình xuất 3 số theo thứ tự tăng dần.
	 */
	public static void returnIncreasingOrder() {
		System.out.println("*****Question 2*****\nPlease input 3 integers:");
		List<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < 3; i++) {
			int num = scanner.nextInt();
			nums.add(num);
		}
		if (nums.get(0) > nums.get(1)) {
			// Swap index 0 and 1
			int temp = nums.get(0);
			nums.set(0, nums.get(1));
			nums.set(1, temp);
		}
		if (nums.get(1) > nums.get(2)) {
			// Swap index 1 and 2
			int temp = nums.get(1);
			nums.set(1, nums.get(2));
			nums.set(2, temp);
		}
		if (nums.get(0) > nums.get(1)) {
			// Swap 0 and 1
			int temp = nums.get(0);
			nums.set(0, nums.get(1));
			nums.set(1, temp);
		}
		System.out.println("The 3 numbers sorted in ascending order are: ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
	}

	/**
	 * Question 3: Cũng yêu cầu như câu 2, nhưng cho phép Hỏi người dùng muốn xuất theo thứ tự nào, 
	 * nếu người dùng chọn 1 thì xuất Tăng dần, người dùng chọn 2 thì xuất giảm dần.
	 */
	public static void returnRequestedOrder() {
		System.out.println("*****Question 3*****\nPlease input 3 integers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		System.out.println("Please select the sorting order: Press 1 for ascending (increasing) or 2 for descending (decreasing):");
		int selection = -1;
		while(true) {
			selection = scanner.nextInt();
			if (selection == 1 || selection == 2) {
				break;
			}
			System.out.println("Please selection a valid option (1 - increasing or 2 - decreasing)");
		}
		int[] results = sortThreeNumber(a, b, c, selection);
		System.out.println("Sorted numbers based on your selection: " + results[0] + " " 
				+ results[1] + " " + results[2] + "\n");

	}

	private static int[] sortThreeNumber(int a, int b, int c, int order) {
		// int order is guaranteed to have value of 1 or 2
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (order == 2) {
			return new int[] {c, b, a};
		} else {
			return new int[] {a, b, c};
		}
		
	}
	/**
	 * Question 4: Viết chương trình cho phép nhập vào số nguyên có hai chữ số. Hãy in ra cách đọc của số nguyên này.
	 */
	public static String numberToWords() {
		System.out.println("*****Question 4*****\nPlease enter a 2-digit number: ");
		int input;
		boolean neg = false;
		while(true) {
			input = scanner.nextInt();
			int digits = (int) Math.floor(Math.log10(Math.abs(input))) + 1;
			if (digits == 2) {
				if (input < 0) { neg = true; }
				break;
			}
			System.out.println("Error: Invalid input. Please enter a 2-digit number: ");
		}
		Map<Integer, String> transcription = new HashMap<Integer, String>();
		transcription.put(1, "mốt"); //'mười' - firstDigit, 'mốt'- secondDigit from 20
		transcription.put(2, "hai");
		transcription.put(3, "ba");
		transcription.put(4, "bốn");
		transcription.put(5, "năm"); // 'năm' - first digit is 5
		transcription.put(6, "sáu");
		transcription.put(7, "bảy");
		transcription.put(8, "tám");
		transcription.put(9, "chín");
		int firstDigit = Math.abs(input) / 10;
		int secondDigit = Math.abs(input) % 10;
		
		String resString;
		if (Math.abs(input) == 11) {
			resString = "mười một";
		} else if (Math.abs(input) == 10) {
			resString = "mười";
		} else if (Math.abs(input) < 20) {
			resString = "mười " + (secondDigit != 5? transcription.get(secondDigit): "lăm");
		} else if (secondDigit == 0) {
			resString = transcription.get(firstDigit) + " mươi";
		} else if (secondDigit == 5) {
			resString = transcription.get(firstDigit) + " mươi lăm";
		} else {
			resString = transcription.get(firstDigit) + " mươi " + transcription.get(secondDigit);
		}
		
		System.out.println(input + " được đọc là: " + (neg? "âm " + resString: resString));
		
		return resString;
	}
	/**
	 * Question 5: Hãy viết chương trình "Chào Hỏi" các thành viên của gia đình có đặc điểm sau đây: 
	 * đầu tiên máy sẽ hỏi ai đang sử dụng máy. Sau đó căn cứ vào câu trả lời nhận được mà máy cần đưa ra 
	 * một câu chào hợp lý, dễ thương. Giả sử trong gia đình có 4 thành viên là : Bố (B), Mẹ (M), anh trai (A) và em gái (E)
	 */
	public static void greetings() {
		System.out.println("\n*****Question 5*****\nHello ~(^v^)'! Which family member are you? Which family member are you? Please enter: Bố (B), Mẹ (M), Anh trai (A), or Em gái (E):");
		char who = scanner.next().toUpperCase().charAt(0);
		switch(who) {
			case 'B':
				System.out.println("Hê lô bố! Mong bố có một ngày thật vui vẻ và hạnh phúc!");
				break;
			case 'M':
				System.out.println("Mom yêu dấu! Mong mẹ có ngày tràn đầy năng lượng và niềm vui!");
				break;
			case 'A':
				System.out.println("Chào chàng hoàng tử nhí, tận hưởng ngày hôm nay nhé!");
				break;
			case 'E':
				System.out.println("Hê lô công chúa bé nhỏ! Luôn vui vẻ và hạnh phúc nhé! ");
				break;
			default:
				System.out.println("Ái chà.. mình không nhận diện được bạn...");
		}
	}

	public static void main(String[] args) {
		// Question 1:
		maxOfTwo();
		// Question 2:
		returnIncreasingOrder();
		// Question 3:
		returnRequestedOrder();
		// Question 4:
		numberToWords();
		// Question 5:
		greetings();
		
	}

}
