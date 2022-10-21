import java.util.Scanner;

public class createFigure {

	public static void main(String[] args) {
		int space = 0;
		Scanner value = new Scanner(System.in);
		System.out.println("write 'q' to quit");
		System.out.print("Please enter a positive integer value:");
		String number = value.nextLine();

		System.out.println("Value:"+ number);
		System.out.println("----------------");

		if (number.equals("q")) {
			System.out.println("Program is terminating");
			break;
		}
		else {
			int n = Integer.parseInt(number); // değer kalan ksıımda integer olmalı

			for (int i = n; i > 0; i = i - 2) { // Şekilin üst kısmı

				for (int j = 0; j < space; j++) {

					System.out.print(" "); // satırların başındaki boşluklar
				}

				space += 1;
				for (int j = 0; j < i; j++) {

					System.out.print("*");

				}
				System.out.println(); // satır atlamak için
			}
			if (n % 2 == 0) { // tek-çift kontrolü (çift olma durumu)
				space -= 1;
				for (int i = 2; i <= n; i = i + 2) {

					for (int j = 0; j < space; j++) {

						System.out.print(" ");
					}

					space -= 1;

					for (int j = 0; j < i; j++) {

						System.out.print("*");

					}
					System.out.println(); 
				}
			} else { // tek olma durumu
				space -= 2;
				for (int i = 3; i <= n; i = i + 2) {

					for (int j = 0; j < space; j++) {

						System.out.print(" ");
					}

					space -= 1;

					for (int j = 0; j < i; j++) {

						System.out.print("*");

					}
					System.out.println();
				}
			}
		}
	}
}
