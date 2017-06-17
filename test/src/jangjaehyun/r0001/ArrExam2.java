package jangjaehyun.r0001;

import java.util.Scanner;

public class ArrExam2 {
		// Scanner클래스의 nextLine()함수를 사용하여 초기값과 맥스값을 입력받아주세요.
		// 위에서 받은 초기값부터 맥스값 까지 반복하는 반복문을 작성해주세요.
		// 스트링 배열변수를 선언해주세요. 
		// 해당배열변수의 방의 갯수는 위에서 받아온 초기값과 맥스값으로 계산해야 에러가 나지 않습니다.
		// 해당반복문에서 Scanner클래스의 nextLine()함수를 사용 하여 위에서 선언한
		// 스트링 배열변수에 0번째 인덱스부터 마지막 방의 인덱스까지 값을 받아주세요.
		// 다음 반복문에서 스트링배열변수가 가진 모든방의 값을 출력해주세요.
	
	public static void main(String[] args)
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.println("최소값을 입력하세요");
		String initNum = scan.nextLine();
		int n1 = Integer.parseInt(initNum);
		
		System.out.println("최대값을 입력하세요");
		String maxNum = scan.nextLine();
		int n2 = Integer.parseInt(maxNum);
		
		String[] a = new String[n2];
		for(int i= n1;i < a.length ;i++)
		{
			System.out.println(i+1 +"번째 데이터를 입력해주세요");
			a[i] = scan.nextLine();
		}
		
		for(int i= n1;i < a.length ;i++)
		{
			System.out.println(i+1 + "번째 방 데이터: " + a[i]);
		}		
	}
}
