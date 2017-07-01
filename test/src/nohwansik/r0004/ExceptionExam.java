package nohwansik.r0004;

import java.util.Scanner;

public class ExceptionExam {
	
	public int getIntFromStr() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		String str = scan.nextLine();
		return Integer.parseInt(str);
	}
	
	
	public static void main(String[] args) {
		int a = 0;
		ExceptionExam ee = new ExceptionExam();
		try{
			a = ee.getIntFromStr();
		}catch(Exception e){
			System.out.println("숫자로 입력해주세요.");
		}
		System.out.println("a값을 잘 입력하셨네요. a = " + a);
	}

}
