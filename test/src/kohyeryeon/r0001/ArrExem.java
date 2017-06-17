package kohyeryeon.r0001;

import java.util.Scanner;

public class ArrExem {
	
//1부터 10까지 도는 반복문 작성. 스캐너 클래스를 이용해서 넥라인 함수를 호출하여
//입력받은 값을 그대로 출력.
	public static void main(String[] args){
		
		String[] arrStr = new String[10];
		Scanner scan = new Scanner(System.in);
		String initNum = scan.nextLine();
		int num1 = Integer.parseInt(initNum);
		String MaxNum = scan.nextLine();
		int num2 = Integer.parseInt(MaxNum);
		
		for(int i=num1;i<=num2;i++){
			
			arrStr[-num1] = scan.nextLine();
		}
		
		for(int i=0;i<arrStr.length;i++){  //arrStr.length 방의 개수!
			System.out.println(arrStr[i]);
		}
		
	}

}
