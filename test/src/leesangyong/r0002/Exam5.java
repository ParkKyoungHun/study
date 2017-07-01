package leesangyong.r0002;

public class Exam5 {

	public int getPlustNum(int num){
		return ++num;
	}
	public static void main(String[]args){
		Exam5 e = new Exam5();
		int a = 1;
		while(a<=3){
			System.out.println("a의 값이 1이네요");
			a = e.getPlustNum(a);
		}
		System.out.println(a);
	}
}
