package leesangyong.r0002;

public class Exam2 {
	String str = "a";
	
	public static void main(String[]args){
		Exam2 e2 = new Exam2();
		Exam e = new Exam();
		System.out.println(e2.str==e.str);
		System.out.println(e2.str.hashCode());
		System.out.println(e2.str.hashCode());
		
	}
}
