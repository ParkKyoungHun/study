package umwoosung.r0002;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("최소값을 입력해주세요");
		a = Integer.parseInt(scan.nextLine());
		System.out.println("최대값을 입력해주세요");
		b = Integer.parseInt(scan.nextLine());

		String[] n = new String[b - a + 1];
		//

		for (int i = 0; i <= b - a; i++) {
			n[i] = "" + i;
			System.out.println("번호"+n[i]);
		}

		for (int i = a; i <= b; i++) {
			System.out.println("입력값"+i);
		}
	}
}
