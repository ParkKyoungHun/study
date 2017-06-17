package kyounghunpark.r0001;

import java.util.Scanner;

public class ArrExam {
	//1부터 10까지 도는 반복문을 작성해주시고
	//Scanner클래스를 이용해서 nextLine()함수를 호출하여
	//입력받은 값을 그대로 출력해주시기 바랍니다.
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] arrStr = new String[10];
		for(int i=0;i<=9;i++){
			String str = scan.nextLine();
			arrStr[i] = str;
		}

		for(int i=0;i<=9;i++){
			System.out.println(arrStr[i]);
		}
	}
}
