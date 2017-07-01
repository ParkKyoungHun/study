package nohwansik.r0002;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ArrayListExam에 멤버변수로 ArrayList변수를 하나 생성해주세요.
// 변수명은 list, 초기화는 ArrayListExam 생성자에서 해주세요.
// Scanner 함수 nextLine()을 이용해 반복문 10번 돌게 한 후
// 멤버변수 list에 값을 넣은 후
// 다시 반복문을 하나 더 만들어 list값으 출력해주세요.
public class ArrayListExam3 {
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> list;

	ArrayListExam3() {
		list = new ArrayList<Integer>();
	}

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
		ArrayListExam3 ale = new ArrayListExam3();
		for (int i = 0; i < 5; i++) {
			System.out.println("값을 입력해주세요.");
			ale.list.add(ale.getIntFormString());
		}
		System.out.println(ale.list);
		for (int i = 0; i < 5; i++) {
			System.out.println(ale.list.get(i));
		}

	}

}
