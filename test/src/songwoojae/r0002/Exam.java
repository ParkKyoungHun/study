package songwoojae.r0002;

public class Exam {
	String[] str = new String[3];
	Exam(){
		for(int i=0;i<str.length;i++){
			str[i] ="1";
		}
		System.out.println(str[0] == str[1]);
	}
	public static void main(String[] args){
		new Exam();
	
	
	}
	
}
