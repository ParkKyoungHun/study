package kohyeryeon.r0001;

import java.util.Scanner;

public class Exem {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int a = Integer.parseInt(str);
		
		String str2 = scan.nextLine();
		int b = Integer.parseInt(str2);
		
		for(int i=a;i>b;i--){
			if(i==b){
				System.out.println(i);
			}else{
				System.out.print(i + ",");
			}
			
			
		}
	}

}
