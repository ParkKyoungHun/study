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
	
	public static void main(String[] args){
		ArrayList<Object> list1 = new ArrayList<Object>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<String> list3 = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=1;i<=10;i++){
			list1.add(i);
		}
	
		list2.add("가");
		list2.add("나");
		list2.add("다");
		list2.add("라");
		list2.add("마");
		list2.add("바");
		list2.add("사");
		list2.add("아");
		list2.add("자");
		list2.add("차");
		list2.add("카");
		list2.add("타");
		list2.add("파");
		list2.add("하");
			
		list3.add("a");
		list3.add("b");
		list3.add("c");
		list3.add("d");
		list3.add("e");
		list3.add("f");
		list3.add("g");
		list3.add("h");
		list3.add("i");
		list3.add("j");
		list3.add("k");
		list3.add("l");
		list3.add("m");
		list3.add("n");
		list3.add("p");
		list3.add("q");
		list3.add("r");
		list3.add("s");
		list3.add("t");
		list3.add("u");
		list3.add("v");
		list3.add("w");
		list3.add("x");
		list3.add("y");
		list3.add("z");
		
		HashMap<Object,ArrayList> hm = new HashMap<Object,ArrayList>();	
	
		hm.put(list1.get(0),list1);
		hm.put(list2.get(0),list2);
		hm.put(list3.get(0),list3);
		
		System.out.println(hm);
		
	}
	
}
