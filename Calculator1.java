package week1.day1;

public class Calculator1 {
	
	public int add (int num1, int num2,int num3) {
		return num1+num2+num3;
	}
	
	public int sub (int num1, int num2) {
		return num1-num2;
	}
	
	public double mul (double num1, double num2) {
		return num1*num2;
	}
	
	public float div (float num1, float num2) {
		return num1/num2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator1 obj1 = new Calculator1();
		int addition = obj1.add(5,6,7);
		System.out.println("Sum of digits: "+addition);
		
		int substract = obj1.sub(15,6);
		System.out.println("Sub of two digits: "+substract);
		
		double multiply = obj1.mul(8.8971826829,6.7868686);
		System.out.println("Mult of two digits: "+multiply);
	
		double division = obj1.div(54.55f,6.88f);
		System.out.println("Div of two digits: "+division);

	}

}
