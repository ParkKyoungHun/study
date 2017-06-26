package kyounghunpark.r0002;

public class Exam5 {

	public int getPlustNum(int num){
		System.out.println("a의 값이 1이네요");
		num++;
		if(num<=3){
			num = getPlustNum(num);
		}
		return num;
	}
	public static void main(String[] args){
		Exam5 e = new Exam5();
		int a = 1;
		e.getPlustNum(a);
		System.out.println(a);
	}
}
