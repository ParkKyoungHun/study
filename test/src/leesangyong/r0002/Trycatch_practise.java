package leesangyong.r0002;

import java.util.Scanner;

public class Trycatch_practise {
	Scanner scan = new Scanner(System.in);
	public int getIntFromString(){
		try {
			return Integer.parseInt(scan.nextLine());
		}catch(Exception e){
		return getIntFromString();
	}
	}
	public static void main(String[]args){
		System.out.println("초기값");
		System.out.println("종료값");
		}
}
