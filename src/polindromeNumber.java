import java.util.Scanner;

public class polindromeNumber {

	public static void main(String[] args) {
		
		while (true) {

			Scanner value = new Scanner(System.in); // kullanıcıdan değer almak için
			System.out.println("write -1 to quit");
			System.out.print("Enter a 7-digit number:");
			int n = value.nextInt();

			int remainder;
			int number = n;

			String n2 = number + ""; // to find the number of elements in the series
			int[] arr = new int[n2.length()]; // to find out how many elements my know contains

			if (n == -1) { // çıkış
				System.out.println("Program is terminating");
				break;

			}

			
	}
}
}
