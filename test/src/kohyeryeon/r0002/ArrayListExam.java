package kohyeryeon.r0002;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam {
	//ArrayListExam에 멤버변수로 ArrayList변수를 하나 생성해주세요.
	//변수명은 list이며 초기화는 ArrayListExam 생성자에서 해주세요.
	//Scanner클래스의 nextLine()함수를 사용하여 반복문 10번이 돌때가지
	//맴버변수 list에 값을 넣어주신후
	//다시 반복문을 하나 더 만들어 list값을 출력해주세요.
	ArrayList list;
	ArrayListExam(){
		list = new ArrayList();
	}
	
	public static void main(String[] args){
		ArrayListExam ale = new ArrayListExam();
		
		Scanner scan = new Scanner(System.in);
		for(int i=1;i<=10;i++){
			ale.list.add(scan.nextLine());
		}
		System.out.println(ale.list);
		
		
		
	}
	
	
	

}
