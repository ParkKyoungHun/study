package leesangyong.r0002;

import java.util.Scanner;

public class Try_trycatch {
	Scanner scan = new Scanner(System.in);
	public int getIntformString(){ //에러가 날때 두가지 방법으로 해결 가능
		String str = scan.nextLine();
		try{				// Exception 에 리턴을 넣어주거나 트라이캐치문밑에 넣어주면 됨.
			return Integer.parseInt(str);
		}catch(Exception e){
			System.out.println("숫자 입력하여야합니다.");
			return getIntformString();
		}
//		return 0;
	}
	public static void main(String[]args){
		Try_trycatch e = new Try_trycatch();
		System.out.println("초기값을 입력하세요");
		int initNum = e.getIntformString();
		System.out.println("종료값을 입력하세요");
		int maxNum = e.getIntformString();
		String[] st = new String[maxNum-initNum];
		for(int i=initNum;i<=maxNum-1;i++){
			System.out.println(i-initNum+"번 배열의 값을 입력하세요");
			st[i-initNum] = e.scan.nextLine();
		}
		for(int i=initNum;i<=maxNum-1;i++){
		System.out.println(i-initNum+"번배열 값은 ="+st[i-initNum]);
	}
}
}
