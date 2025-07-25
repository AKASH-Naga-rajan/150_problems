package number_based;

import java.util.Scanner;

public class Odd_followed_by_even_27 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Enter an integer: ");
		        int num = sc.nextInt();
		        int temp = num;
		        int[] digits = new int[10];
		        int count = 0;
		        while (temp > 0) {
		            digits[count++] = temp % 10;
		            temp /= 10;
		        }
		        System.out.print("Rearranged number: ");
		        for (int i = count - 1; i >= 0; i--) {
		            if (digits[i] % 2 != 0)
		                System.out.print(digits[i]);
		        }
		        for (int i = count - 1; i >= 0; i--) {
		            if (digits[i] % 2 == 0)
		                System.out.print(digits[i]);
		        }

		        System.out.println();
		    }
	}

