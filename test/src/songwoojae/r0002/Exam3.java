package songwoojae.r0002;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Exam2 e2 = new Exam2();
		
		try {
			System.out.println("initNum 입력 = ");
			 int initNum = Integer.parseInt(scan.nextLine());
			System.out.println("maxNum 입력 = ");
			 int maxNum = Integer.parseInt(scan.nextLine());
		
		String[] arrStr = new String[maxNum - initNum + 1];


		System.out.println("숫자 입력 = ");
		for (int i = initNum; i <= maxNum; i++) {
			int num = Integer.parseInt(scan.nextLine());
			arrStr[i - initNum] = "" + num;
		}

		for (int i = initNum; i <= maxNum; i++) {

			System.out.println(arrStr[i - initNum]);
		}

	
	} 
	catch (Exception e) {
		System.out.println("다시 입력하세요");
	}
	
	}
}
