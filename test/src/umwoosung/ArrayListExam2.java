package umwoosung;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam2 {
	//ArrayListExam에 멤버변수로 Arrayist 변수를 하나 생성해주세요
	//변수명은 1ist이며 초기화는 ArrayListExam 생성자에서 해주세요.
	//Scanner 클래스의 nextLine()함수를 사용하여 반복문을 10번돌때까지
	//멤버변수 1ist에 값을 넣어주신후
	//다시 반복문을 하나더 만들어 1ist값을 출력해주세요
	ArrayList list; //멤버변수
	
	ArrayListExam2(){
		list =new ArrayList();
	}
	
	public static void main(String[]args){
		ArrayListExam2 ale2 = new ArrayListExam2();
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=2;i++){
			System.out.println("값을 입력해주세요");
			try{
			ale2.list.add(Integer.parseInt(scan.nextLine()));//Integer.parseInt(scan.nextLine());
		}catch(Exception e){
			i--;
		System.out.println("누가 문자넣으래");
		}
			
	}System.out.println(ale2.list);
}
}