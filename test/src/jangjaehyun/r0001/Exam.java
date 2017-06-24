package jangjaehyun.r0001;

import java.util.Scanner;

public class Exam {
	static int a;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s1 = scan.nextLine();
		int num1 = Integer.parseInt(s1);
		String s2 = scan.nextLine();
		int num2 = Integer.parseInt(s2);

		for (int i = num1; i <= num2; i++) {
			System.out.print(i);

			if (i == num2) {
				System.out.print(" ");
			} else {
				System.out.print(" , ");
			}
		}
		for (int i = num2; i >= num1; i--) {
			System.out.print(i);
			if (i == num1) {
				System.out.print(" ");
			} else {
				System.out.print(" , ");
			}
		}
	}
}
