package week1.day1;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=123, digit, sum = 0;  
		
		while(number > 0)  
		{  
		//finds the last digit of the given number    
		digit = number % 10;  
		//adds last digit to the variable sum  
		sum = sum + digit;  
		//removes the last digit from the number  
		number = number / 10;  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+sum);
			   
		
	}

	}


