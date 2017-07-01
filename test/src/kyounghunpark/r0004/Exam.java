package kyounghunpark.r0004;

public class Exam {
	static int a = 3;
	
	public static void printStr(){
		System.out.println("호출했네요!!");
	}
	
	
	public static void main(String[] args){
		Exam e = new Exam();
		e.printStr();
		
		e = new Exam();
		e.printStr();
		Exam.printStr();
	}
}
