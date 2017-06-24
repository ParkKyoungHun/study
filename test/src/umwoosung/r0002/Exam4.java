package umwoosung.r0002;

import java.util.Scanner;

import kyounghunpark.r0002.Exam3;

public class Exam4 {
	Scanner scan = new Scanner(System.in);
	public int getIntFormString() {
		String str = scan.nextLine();
		try{
			return Integer.parseInt(str);
		}catch(Exception e){
			System.out.println("숫자 입력하라고 임마!!!");
			return getIntFormString();
		}
	}

	public static void main(String[] args) {
		Exam4 e4 = new Exam4();
		System.out.println("초기값 입력해!");
		int initNum = e4.getIntFormString();
		System.out.println("맥스값 입력해!");
		int maxNum = e4.getIntFormString();
		String[] arrStr = new String[maxNum - initNum + 1];

		for (int i = initNum; i <= maxNum; i++) {
			arrStr[i - initNum] = "" + i;
		}

		for (int i = initNum; i <= maxNum; i++) {
			System.out.println(arrStr[i - initNum]);
		}

	}
}
