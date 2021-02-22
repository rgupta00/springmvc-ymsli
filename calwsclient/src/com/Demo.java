package com;

public class Demo {

	public static void main(String[] args) {
			CalculatorService calculatorService=new CalculatorService();
								//it will give a proxy object
			
			Calculator calculator=calculatorService.getCalculatorPort();
			System.out.println(calculator.add(3, 2));
	}
}
