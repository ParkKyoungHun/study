package songwoojae.r0002;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam {
	// ArrayListExam에 멤버변수로 ArrayList변수를 하나 생성해주세요.
	// 변수명은 list이며 초기화는 ArrayListExam 생성자에서 해주세요.
	// Scanner클래스의 nextLine()함수를 사용하여 반복문 10번이 돌때까지
	// 멤버변수 list에 값을 넣어주신후
	// 다시 반복문을 하나 더 만들어 list값을 출력해주세요.
	
	ArrayList list ;
	ArrayListExam() {
	list = new ArrayList();
	}

	public static void main(String[] args) {
		ArrayList list;
		Scanner scan = new Scanner(System.in);
		ArrayListExam ale = new ArrayListExam();
		
		System.out.println("숫자 입력 하세요 -> ");
		for (int i = 0; i < 10; i++) {
			ale.list.add(Integer.parseInt(scan.nextLine()));
		}
		for (int i = 0; i < ale.list.size(); i++) {
			System.out.print(ale.list.get(i) + " ");
		}
	}

}
