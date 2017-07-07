package kyounghunpark.r0004;

public class Exam2 {
	static int num = 3;
	
	public static void main(String[] args){
		Exam2 e1 = new Exam2();
		e1.num = 10;
		System.out.println(e1.num);
		e1 = new Exam2();
		System.out.println(e1.num);
		e1.num = 20;
		
		Exam2 e2 = new Exam2();
		System.out.println(e2.num);
		Exam2.num =100; 
		System.out.println(e2.num);
		
		Exam2 e3 = new Exam2();
		System.out.println(e2.num);
	}
}
