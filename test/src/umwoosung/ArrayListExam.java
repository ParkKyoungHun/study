package umwoosung;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam {
	//ArrayListExam에 멤버변수로 Arrayist 변수를 하나 생성해주세요
	//변수명은 1ist이며 초기화는 ArrayListExam 생성자에서 해주세요.
	//Scanner 클래스의 nextLine()함수를 사용하여 반복문을 10번돌때까지
	//멤버변수 1ist에 값을 넣어주신후
	//다시 반복문을 하나더 만들어 1ist값을 출력해주세요
	ArrayList list; //멤버변수
	
	public ArrayListExam(){
		list =new ArrayList();
	}
	
	public static void main(String[]args){
		ArrayListExam ale = new ArrayListExam();
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<=10;i++){
			System.out.println("값을 입력해주세요");
			ale.list.add(scan.nextLine());//Integer.parseInt(scan.nextLine());
		}
		System.out.println(ale.list);
		
	}//ale.list.add??????????
}
