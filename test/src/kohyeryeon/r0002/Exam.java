package kohyeryeon.r0002;

public class Exam {
	String str = "a";
	
	Exam(){
		String a = new String("a");
		
		System.out.println(a==this.str); //주소값 비교.
	}

	
	public static void main(String[] args){
		Exam e = new Exam();
		
	}
}
