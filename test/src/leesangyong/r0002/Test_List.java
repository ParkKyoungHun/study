package leesangyong.r0002;

import java.util.ArrayList;

public class Test_List {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for(int i=0;i<=10;i++){
//			Integer integer = 3; //new를 이클립스에서 대신 해줌.
			al.add(i);
			System.out.println(al.get(i));
		}
}
}