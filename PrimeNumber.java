package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 13;
		
		boolean flag = true;
		
		
		for (int i = 2; i < input/2; i++) {
				if (input%i==0) {
					flag = false;
					break;
			}
		}
				
			if(flag==true) {
				System.out.println("It is prime number: "+input);
			}else
			{
				System.out.println("It is not a prime number: "+input);
			}
			
			
		}
		
	}
	

			
			

	


