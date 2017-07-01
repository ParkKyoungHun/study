package kyounghunpark.r0004;

import java.util.Scanner;

public class ExceptionExam {

	Scanner scan;
	public int getInt()throws NullPointerException, Exception{
		scan = new Scanner(System.in);
		return getIntFromStr();
	}
	public int getIntFromStr() throws NullPointerException, Exception{
		
		System.out.println("숫자를 입력해주세요.");
		String str = scan.nextLine();
		return Integer.parseInt(str);
	}
	
	public static void main(String[] args){
		int a = 0;
		ExceptionExam ee = new ExceptionExam();
		try{
			a = ee.getInt();
		}catch(NullPointerException e){
			System.out.println("널포인트 익셉션이네??");
		}catch(Exception e){
			System.out.println("숫자를 입력하랬잖아!!!!");
		}
		System.out.println("a값을 잘 입력하셨네요, a = " + a);
	}
}
