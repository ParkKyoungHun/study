package kyounghunpark.r0001;

public class ArrExam3 {

	public static void main(String[] args){
		String result ="";
		long[] a = new long[10];
		for(int i=0;i<10;i++){
		   result += (i+1);
		   a[i] = Long.parseLong(result);
		}

		for(int i=0;i<10;i++){
			System.out.println(a[i]);
		}
	}
}
