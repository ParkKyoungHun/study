package kohyeryeon.r0002;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam2 {
	// ArrayListExam2에 멤버변수로 ArrayList<Integer>변수를 하나 생성해주세요.
	// 변수명은 list이며 초기화는 ArrayListExam2로 생성자에서 해주세요.
	// Scanner클래스의 nextLine()함수를 사용하여 반복문 10번이 돌때까지
	// 맴버변수 list에 값을 넣어주시는데 위의 ArrayList는 Integer타입의 값 밖에 들어갈수없습니다.
	// try/catch 문을 사용하여 Integer타입으로 변환이 불가능할 경우
	// 다시 입력받을수있게 만들어주세요. 다시 반목문을 하나 더 만들어 list값을 출력해주세요.

	ArrayList<Integer> list;

	ArrayListExam2() {
		list = new ArrayList<Integer>();
	}

	public int getSacn() {
		Scanner scan = new Scanner(System.in);
		try {
			return Integer.parseInt(scan.nextLine());
		} catch (Exception e) {
			System.out.println("숫자를 입력해야지!");
			return getSacn();
		}
	}

	public static void main(String[] args) {
		ArrayListExam2 ale2 = new ArrayListExam2();
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			ale2.list.add(ale2.getSacn());
		}
		System.out.println(ale2.list);
	}
}
