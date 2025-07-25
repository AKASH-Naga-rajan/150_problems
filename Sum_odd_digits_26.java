package number_based;

import java.util.Scanner;

public class Sum_odd_digits_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int d = 0;
		int sum = 0;
		while (n > 0) {
			d = n % 10;
			if (d % 2 != 0)
				sum += d;
			n /= 10;
		}
		System.out.println("The sum of odd digits=" + sum);

	}

}
