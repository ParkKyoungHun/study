package kohyeryeon.r0002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exam4 extends HashMap{
	//1부터 10까지 가진 리스트 1개
	//문자 a 부터 z 까지 가진 리스트 1개
	//문자 가 부터 하까지 가진 리스트 1개
	//이렇 1개의 해쉬맵에 다 넣어봐요
	//단 키값은 각 리스트의 0번째 방 값입니다
	ArrayList<String> list1;
	ArrayList<String> list2;
	ArrayList<String> list3;
	
	Exam4(){
		list1 = new ArrayList<String>();
		list2 = new ArrayList<String>();
		list3 = new ArrayList<String>();
	}
	
	
	public static void main(String[] args){
		HashMap<Integer,ArrayList<String>> hm = new HashMap<Integer,ArrayList<String>>();
		
		//hm.put(0, arg1);
		Scanner scan = new Scanner(System.in);
		Exam4 e4 = new Exam4();
		for(int i=1;i<=10;i++){
			e4.list1.add(i+"");
		}
	
		e4.list2.add("가");
		e4.list2.add("나");
		e4.list2.add("다");
		e4.list2.add("라");
		e4.list2.add("마");
		e4.list2.add("바");
		e4.list2.add("사");
		e4.list2.add("아");
		e4.list2.add("자");
		e4.list2.add("차");
		e4.list2.add("카");
		e4.list2.add("타");
		e4.list2.add("파");
		e4.list2.add("하");
			
		e4.list3.add("a");
		e4.list3.add("b");
		e4.list3.add("c");
		e4.list3.add("d");
		e4.list3.add("e");
		e4.list3.add("f");
		e4.list3.add("g");
		e4.list3.add("h");
		e4.list3.add("i");
		e4.list3.add("j");
		e4.list3.add("k");
		e4.list3.add("l");
		e4.list3.add("m");
		e4.list3.add("n");
		e4.list3.add("p");
		e4.list3.add("q");
		e4.list3.add("r");
		e4.list3.add("s");
		e4.list3.add("t");
		e4.list3.add("u");
		e4.list3.add("v");
		e4.list3.add("w");
		e4.list3.add("x");
		e4.list3.add("y");
		e4.list3.add("z");
		
		System.out.println(hm);
		
	}
	
}
