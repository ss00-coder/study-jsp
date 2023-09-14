package com.task.app;

public class Calc {
	private int number1;
	private int number2;
	
	public Calc() {;}

	public Calc(String number1, String number2) {
		this.number1 = Integer.parseInt(number1);
		this.number2 = Integer.parseInt(number2);
	}

	public int add() {return number1 + number2;}
	public int sub() {return number1 - number2;}
	public int mul() {return number1 * number2;}
	public int div() {return number1 / number2;}
	
}
