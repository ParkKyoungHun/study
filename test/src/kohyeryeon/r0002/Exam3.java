package kohyeryeon.r0002;

import java.util.Scanner;

public class Exam3 {
	
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		int initNum = Integer.parseInt(str1);
		String str2 = scan.nextLine();
		int maxNum = Integer.parseInt(str2);
		
		
		String[] str = new String[(maxNum-initNum)+1];
				
		for(int i=initNum;i<=str.length;i++){
			str[i-initNum] = i+""; 
			
		}
		
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
		
		
	}
}
