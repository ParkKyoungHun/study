package kohyeryeon.r0001;

import java.util.Scanner;

public class ArrExam4 {
	  // Scanner클래스의 nextLine()함수를 사용하여 초기값과 맥스값을 입력받아주세요.
	   // 위에서 받은 초기값부터 맥스값 까지 반복하는 반복문을 작성하여 초기값부터 맥스값까지 더한 값을 출력해주세요
	   // 출력은 1번만 하면 됩니다.
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		int initNum = Integer.parseInt(str1);
		String str2 = scan.nextLine();
		int maxNum = Integer.parseInt(str2);
		
		int result = 0;
		for(int i=initNum; i<=maxNum; i++){
			result += i;
		}
		System.out.println(result);
		
	}

}
