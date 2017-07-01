package kyounghunpark.r0003;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam02 {
	// ArrayListExam에 멤버변수로 ArrayList변수를 하나 생성하여 변수명은 list이며 초기화는 ArrayListExam 생성자에서 한 예제입니다.
	// 실행 시 출력 값이 [1,2,3,4,5,6,7,8,9,10] 이 되게 빈대괄호에 알맞은 코딩을 작성해주세요.
	
	ArrayList list;
	Exam02(){
		list = new ArrayList();
	}
	
	public static void main(String[] args){
		ArrayList list;
		Scanner scan = new Scanner(System.in);
		Exam02 ale = new Exam02();
		for(int i=0;i<10;i++){
			ale.list.add(i+1);
		}
		
		System.out.println(ale.list);
//		 배열변수를 선언하여 아래의 값이 들어가는 코드를 작성해주세요. 변수명은 arrStr 로 해주세요.
		String[] arrStr = {"월", "화", "수"};
	}
}

