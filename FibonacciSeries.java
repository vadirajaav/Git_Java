package week1.day1;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range = 8, firstNum = 0, secNum = 1, sum=0;
		System.out.print(firstNum+" ");
		System.out.print(secNum);
		
		for (int i = 2; i <= range-1; i++) {
			
			sum=firstNum+secNum;
			
			System.out.print(" ");
			
			System.out.print(sum);
			
			firstNum=secNum;
			
			secNum=sum;
			
		}
	}
}
