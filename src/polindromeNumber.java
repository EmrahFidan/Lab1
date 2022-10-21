import java.util.Scanner;

public class polindromeNumber {

	public static void main(String[] args) {
		
		while (true) {

			Scanner value = new Scanner(System.in); 
			System.out.println("write -1 to quit");
			System.out.print("Enter a 7-digit number:");
			int n = value.nextInt();

			int remainder;
			int number = n;

			String n2 = number + ""; // to find the number of elements in the series
			int[] arr = new int[n2.length()]; // to find out how many elements my know contains

			if (n == -1) { // exit
				System.out.println("Program is terminating");
				break;

			}
			else{
				for (int i = 0; i < arr.length; i++) {  // divide into digits of number
					remainder = n % 10;
					arr[i] = remainder;
					n = n / 10;
				}
				int counter = 0;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == arr[arr.length - 1 - i]) { // elements checkend in sequence
						counter += 1;
					}
				}
			}

	}
}
}
