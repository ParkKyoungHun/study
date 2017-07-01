package songwoojae.r0002;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam2 {
	// try/catch 문을 사용하여 Integer 타입으로의 변환이 불가능한 경우
	// 다시 입력받을 수 있게

	ArrayList<Integer> list;

	ArrayListExam2() {
		list = new ArrayList<Integer>();
	}

	Scanner scan = new Scanner(System.in);

	public int getInt() {

		String str = scan.nextLine();
		try {

			return Integer.parseInt(scan.nextLine());

		} catch (Exception e) {
			System.out.println("숫자를 입력하세요!!!");
			return getInt();
		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> list;
		ArrayListExam2 ale = new ArrayListExam2();

		System.out.println("숫자 입력 하세요 -> ");

		for (int i = 0; i < 10; i++) {

			int num = ale.getInt();
			ale.list.add(ale.getInt());

		}
		
			System.out.println(ale.list);
		

	}
}
