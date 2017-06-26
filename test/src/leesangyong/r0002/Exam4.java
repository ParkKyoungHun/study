package leesangyong.r0002;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam4 {
//이번엔 리스트로 해보자
	
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("초기값을 넣어주세요");
		int initNum = Integer.parseInt(scan.nextLine());
		System.out.println("초기값을 넣어주세요");
		int maxNum = Integer.parseInt(scan.nextLine());
		ArrayList al = new ArrayList();
		for(int i = initNum; i<=maxNum;i++){
			//Integer integer = i;
			System.out.println("리스트 값 입력해자슥아");
			al.add(scan.nextLine());
		}
		for(int i = 0; i<al.size();i++){
			//Integer integer = i;
			System.out.println(al.get(i));
		}
	}
}
