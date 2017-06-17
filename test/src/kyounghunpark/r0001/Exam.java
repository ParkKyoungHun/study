package kyounghunpark.r0001;

import java.util.Scanner;

public class Exam {
	int a;
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		int num1 = Integer.parseInt(s1);
		String s2 = scan.nextLine();
		int num2 = Integer.parseInt(s2);
		for(int i=num1;i>=num2;i--){
			if(i==num2){
				System.out.println(i);
			}else{
				System.out.print(i+",");
			}
		}
		
	}
}
