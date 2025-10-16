package week1.day2;

public class Check_Number_IsPrime {

	public static void main(String[] args) {

		int n=250;
		boolean isPrime = true;
				
		for(int i=2; i<n;i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}	
			
		}
		if(isPrime)
			System.out.println("Prime number");
		else
			System.out.println("Non prime number");
		
	}

}
