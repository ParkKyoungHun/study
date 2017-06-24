package kyounghunpark.r0002;

import kyounghunpark.r0003.Exam;

public class Exam2 {
	String str = "a";
	Exam2(){
		System.out.println(str.hashCode());
	}
	public static void main(String[] args){
		Exam2 e2 = new Exam2();
		Exam e = new Exam();
		System.out.println(e.str==e2.str);	
	}
}
