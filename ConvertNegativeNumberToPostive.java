package week1.day1;

public class ConvertNegativeNumberToPostive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			int input = -42;
			
			int positiveno=0;
			
			if(input<0)
			{
				positiveno = input * -1;
				System.out.println("Given Negative number is  "+input+" converted to Positive Number is " +positiveno);
			}
			else if (input > 0)
			{
				System.out.println("Given input is positive Number");
			}
		

	}

}
