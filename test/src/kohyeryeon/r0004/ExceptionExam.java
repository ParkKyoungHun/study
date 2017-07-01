package kohyeryeon.r0004;

import java.util.Scanner;
	
public class ExceptionExam {

	public int getIntFromStr() throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해");
		String str = scan.nextLine();
		return Integer.parseInt(str);
	}
	
	public static void main(String[] args){
		ExceptionExam ee = new ExceptionExam();
		int a = 0;
		try{
			a= ee.getIntFromStr();
		}catch(Exception e){
			System.out.println("숫자를 입력해!");
		}
		
		
		System.out.println("a값을 잘 입력");
		
	}

}
