package nohwansik.r0002;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ArrayListExam에 멤버변수로 ArrayList변수를 하나 생성해주세요.
// 변수명은 list, 초기화는 ArrayListExam 생성자에서 해주세요.
// Scanner 함수 nextLine()을 이용해 반복문 10번 돌게 한 후
// 멤버변수 list에 값을 넣은 후
// 다시 반복문을 하나 더 만들어 list값으 출력해주세요.
public class ArrayListExam {
	Scanner scan = new Scanner(System.in);
	ArrayList list;
	ArrayListExam() {
		list = new ArrayList();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayListExam ale = new ArrayListExam();
		for (int i = 0; i < 10; i++) {
			System.out.println("값을 입력해주세요.");
			ale.list.add(scan.nextLine());
		}System.out.println(ale.list);
	}

}
