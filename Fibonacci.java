package Assignment;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0, b=1;
		int result=0;
		
		System.out.print(a+" "+b);
		for (int i =1;i<=1000;i++) {
			
				result = a + b ;
				if(result<1000) {
				System.out.print(" "+ result);
				a= b;
				b=result;
				}
			
		

	}

}
}
