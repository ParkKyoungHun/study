package leesangyong.r0001;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		int sum = 0; // 초기값을 정해줘야 값을 더하고 쓸수 있음
		Scanner scan = new Scanner(System.in);
		System.out.println("입력");
		String a = scan.nextLine();
		int num1 = Integer.parseInt(a);
		String b = scan.nextLine();
		int num2 = Integer.parseInt(b);
		for (int i = num1; i < num2; i++) {
			if (i == (num2-1)) {
				System.out.print(i);
			}else{
			System.out.print(i + ",");
		}
	}
}
}