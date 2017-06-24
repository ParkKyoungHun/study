package kohyeryeon.r0002;

import java.util.Scanner;

public class Exam3 {
	
	Scanner scan = new Scanner(System.in);
	
	public int getIntFormString(){
		String str = scan.nextLine();
		try{
			return Integer.parseInt(str);
		}catch(Exception e){
			System.out.println("숫자를 입력해주게!!!!");
			return getIntFormString();
		}
	}
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		Exam3 e3 = new Exam3();
		System.out.println("초기값 입력해!");
		int initNum = e3.getIntFormString();
		System.out.println("맥스값 입력해!");
		int maxNum = e3.getIntFormString();
		
		String[] str = new String[(maxNum-initNum)+1];
			
		for(int i=initNum;i<=str.length;i++){
				str[i-initNum] = scan.nextLine();
		}	
		for(int i=0;i<str.length;i++){
				System.out.println(str[i]);
		}
	}
}
