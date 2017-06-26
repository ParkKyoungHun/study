package leesangyong.r0002;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam2 {
	/*
	 * ArrayListExam2에 멤버변수로 ArrayList<Integer>변수를 하나 생성해주세요.
	 * 변수명은 list이며 초기화는 ArrayListExam2 생성자에서 해주세요.
	 * Scanner클래스의 nextLine()함수를 사용하여 반복문 10번이 돌때까지
	 * 멤버변수 list에 값을 넣어주시는데 위의 ArrayList는 Integer타입의 값 밖에 들어갈수 없습니다.
	 * try/catch 문을 사용하여 Integer타입으로의 변환이 불가능할 경우
	 * 다시 입력받을 수 있게 만들어 주세요.
	 * 다시 반복문을 하나 더 만들어 list 값을 출력해주세요.
	 */
	ArrayList<Integer> list;
	ArrayListExam2(){
		list = new ArrayList<Integer>();
	}
	public static void main(String[] args) {
		ArrayListExam2 ae ;
		Scanner scan = new Scanner(System.in);
		ae = new ArrayListExam2();
			for(int i=1;i<=10;i++){
				System.out.println(i+"번째 리스트값 입력");
				try{
				ae.list.add(Integer.parseInt(scan.nextLine()));
			}catch(Exception e){
				System.out.println("숫자만 입력가능");
				i--;
			}
			}

	}
}