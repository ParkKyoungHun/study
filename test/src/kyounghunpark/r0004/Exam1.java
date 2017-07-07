package kyounghunpark.r0004;

public class Exam1 {
	final int num;
	Exam1(){
		num=1;
	}
	Exam1(int num){
		this.num=num;
	}
	
	public static void main(String[] args){
		Exam1 e1 = new Exam1();
		System.out.println(e1.num);
		e1 = new Exam1(2);
		System.out.println(e1.num);
		
	}
}
