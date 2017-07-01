package nohwansik.r0002;

import java.util.Scanner;

public class Exam3 {
	Scanner scan = new Scanner(System.in);

	public int getIntFormString() {
		String str = scan.nextLine();
		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			System.out.println("숫자를 입력해주세요.");
			return getIntFormString();
		}
	}

	public static void main(String[] args) {
		Exam3 e3 = new Exam3();
		System.out.println("첫번째 숫자를 입력해주세요.");
		int initNum = e3.getIntFormString();
		System.out.println("두번째 숫자를 입력해주세요");
		int maxNum = e3.getIntFormString();
		String[] arrStr = new String[maxNum - initNum + 1];
		String str = "";
		for (int i = initNum; i <= maxNum; i++) {
			arrStr[i - initNum] = str + i;
		}
		for (int i = initNum; i <= maxNum; i++) {
			System.out.println(arrStr[i - initNum]);
		}
	}

}
