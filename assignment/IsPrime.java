package assignment;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		boolean isPrime = true;
		for(int i = 2; i< num-1; i++) {
			if(num%i == 0) {
				isPrime = false;
				}
			if(isPrime) {
				System.out.println(num + " is prime");
			}
			else
				System.out.println(num + " is not prime");
		}
		
	}

}
