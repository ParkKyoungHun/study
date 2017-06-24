package leesangyong.r0002;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam {
	/*
	 * ArrayListExam에 멤버변수로 ArryList변수를 하나 생성해주세요 변수명은 list 이며 초기화는
	 * ArrayListExam 생성자에서 해주세요 Scanner 클래스의 nextLine()함수를 사용하여 반복문 10번이 돌때까지
	 * 멤버변수 list에 값을 넣어주신후 다시 반복문을 하나 더 만들어 list값을 출력해주세요.
	 */
	int S(){
		return 1;
	}
	ArrayList list; 
	ArrayListExam(){
		list = new ArrayList();
	}
	public static void main(String[] args) {
		ArrayListExam ae ;
		Scanner scan = new Scanner(System.in);
		ae = new ArrayListExam();
			for(int i=1;i<=10;i++){
				System.out.println(i+"번째 리스트값 입력");
				ae.list.add(scan.nextLine());
			}
			for(int i=0;i<=9;i++){
				System.out.println(i+1+"번째 값"+ae.list.get(i));
			}

	}
}