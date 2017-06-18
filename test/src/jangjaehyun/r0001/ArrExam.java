package jangjaehyun.r0001;

import java.util.Scanner;

public class ArrExam {
	// 1부터 10까지 도는 반복문 작성
	// Scannner 클래스를 이용해서 nextLine 합수를 호출하여 입력받은 값을 그대로 출력
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		
		String[] arrStr = new String[10];
		for(int i = 0; i<=9; i++){
		String str = scan.nextLine();
		arrStr[i] = str;
		System.out.println("a[" + i + "] = " + (str));
		}
		for(int i=0; i<=9; i++){
		System.out.println(arrStr[i]);
		}
	}
}
