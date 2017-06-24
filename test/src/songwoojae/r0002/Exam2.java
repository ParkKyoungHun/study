package songwoojae.r0002;

import java.util.Scanner;

import kyounghunpark.r0002.Exam3;

public class Exam2 {
	// Scanner클래스의 nextLine()함수를 사용하여 초기값과 맥스값을 입력받아주세요.
	// 위에서 받은 초기값부터 맥스값 까지 반복하는 반복문을 작성해주세요.
	// 스트링 배열변수를 선언해주세요.
	// 해당배열변수의 방의 갯수는 위에서 받아온 초기값과 맥스값으로 계산해야 에러가 나지 않습니다.
	// 해당반복문에서 Scanner클래스의 nextLine()함수를 사용 하여 위에서 선언한
	// 스트링 배열변수에 0번째 인덱스부터 마지막 방의 인덱스까지 값을 받아주세요.
	// 다음 반복문에서 스트링배열변수가 가진 모든방의 값을 출력해주세요.
	
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	public int getIntformString(){
		String str = scan.nextLine();
		try{
			return Integer.parseInt(str);
		}catch(Exception e){
			System.out.println("숫자를 입력하세요");
			return getIntformString();
		}
	}
	public static void main(String[] args) {
		Exam2 e2 = new Exam2();
		System.out.println("초기값 입력해!");
		int initNum = e2.getIntFormString();
		System.out.println("맥스값 입력해!");
		int maxNum = e2.getIntFormString();
		String[] arrStr = new String[maxNum - initNum + 1];

		for (int i = initNum; i <= maxNum; i++) {
			arrStr[i - initNum] = "" + i;
		}

		for (int i = initNum; i <= maxNum; i++) {
			System.out.println(arrStr[i - initNum]);
		}

	}
}
