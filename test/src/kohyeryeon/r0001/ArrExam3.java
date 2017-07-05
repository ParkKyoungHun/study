package kohyeryeon.r0001;

//import java.util.Scanner;

public class ArrExam3 {
	
	public static void main(String[] args){
//		Scanner scan = new Scanner(System.in);
//		String result ="";
//	      long[] a = new long[10];
//	      for(int i=0;i<10;i++){
//	         result += (i+1);          //result = "" + 1  ->   문자열 "1"이 저장됨.
//	         a[i] = Long.parseLong(result);
//	      }
//
//	      for(int i=0;i<10;i++){
//	         System.out.println(a[i]);
//	      }
		
		
		int[] a = new int[10];
		for(int i=1;i<=10;i++){
			a[i-1] = (i-1)*10+1; 
			
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
