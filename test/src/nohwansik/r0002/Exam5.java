package nohwansik.r0002;

public class Exam5 {
	
	public int getPlusNum(int num){
		System.out.println("a의 값이 1이네요.");
		num++;
		if(num<=3){
			num = getPlusNum(num);
		}
		return num;
	}
	public static void main(String[] args) {
		Exam5 e = new Exam5();
		int a = 1;
		e.getPlusNum(a);
		System.out.println(a);
	}

}
