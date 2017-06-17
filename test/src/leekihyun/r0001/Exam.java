package leekihyun.r0001;

import java.util.Scanner;

public class Exam {

	int a;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = Integer.parseInt(s.nextLine());
		System.out.println("첫번째" + a);

		int b = Integer.parseInt(s.nextLine());
		System.out.println("두번째" + b);

		for (int i = a; i >b; i--) {

			if (i == b+1) {
				System.out.print(i + "");
			} else {
				System.out.print(i + ",");
			}
		}
	}
}