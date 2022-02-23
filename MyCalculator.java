package week1.day1;

import week1.day1.Calculator1;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator1 obj1 = new Calculator1();
		
		int addition = obj1.add(5,6,7);
		System.out.println("Sum of digits: "+addition);
		
		int substract = obj1.sub(15,6);
		System.out.println("Sub of two digits: "+substract);
		
		double multiply = obj1.mul(15.7879,6.68966);
		System.out.println("Mul of two digits: "+multiply);
	
		double division = obj1.div(54.8686f,6.67855f);
		System.out.println("Div of two digits: "+division);

		}

}
