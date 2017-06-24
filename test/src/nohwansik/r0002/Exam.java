package nohwansik.r0002;

public class Exam {
	String str = "a";
	
	Exam(){
		String str = "a";
		
		System.out.println(str==this.str);
		
	}

	public static void main(String[] args) {
		Exam e = new Exam();
		String str = "a";
		System.out.println(str==e.str);
	}

}