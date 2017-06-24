package leekihyun.r0001;

import java.util.Scanner;

public class ArrExam {
	// 1부터 10까지 도는 반복문을 작성하시고
	// Scanner 클래스를 이용해서 nextLine()함수를 호출하여
	// 입력받은 값을 [그대로] 출력해주시기 바랍니다.(입10번 출10번됨)
	//
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//int[] a = new int[10];
		String[] arrStr = new String[10];
		int num1 = Integer.parseInt(s.nextLine());
		System.out.println("첫번째");
		int num2 = Integer.parseInt(s.nextLine());
		System.out.println("두번째");
		for (int i = num1; i <=num2; i++) {

			String str = s.nextLine();
			arrStr[i] = str;

		}
		for (int i = num1; i <=num2; i++) {
			System.out.println(arrStr[i]);
		}
	}
}
