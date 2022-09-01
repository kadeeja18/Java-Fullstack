package oops;

import java.util.Scanner;

public class ClassDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator casio = new Calculator();
		Scanner scan = new Scanner(System.in);
//		while repeats the input ask -
		while(true) {
		System.out.println("Enter Number 1");
		int x =scan.nextInt();
		System.out.println("Enter number 2");
		int y = scan.nextInt();
		
		System.out.println("Enter '+' for addition");
		System.out.println("Enter '-' for Subtraction");
		System.out.println("Enter '*' for Multiplication");
		System.out.println("Enter '/' for Division");
		System.out.println("Enter '/' for Division");
		String operations = scan.next();
		switch(operations) {
		case "+": {
			System.out.println("addition.." +casio.add(x, y));
			break;
		}
		case "-": {
			System.out.println("subrtatction.."+casio.sub(x, y));
			break;
		}
		case "*": {
			System.out.println("multiplication..."+casio.mul(x, y));
			break;
		}
		case "/": {
			System.out.println("division..."+casio.div(x, y));
			break;
		}
		case "%": {
			System.out.println("modulus.."+casio.mod(x,y));
			break;
		}
		default:
			System.out.println("Invalid operation");
			break;
		}
	}
		
		}

}
class Calculator{
	public int add(int i,int j) {
		return i+j;
	}
	public int sub(int i,int j) {
		return i-j;
	}
	public int mul(int i,int j) {
		return i*j;
	}
	public int div(int i, int j) {
		return i/j;
	}
	public int mod(int i,int j) {
		return i%j;
	}
	
}
