package oops;

import java.util.Scanner;

public class ClassDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator casio = new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number 1");
		int x =scan.nextInt();
		System.out.println("Enter number 2");
		int y = scan.nextInt();
		System.out.println("addition.." +casio.add(x, y));
		System.out.println("subrtatction.."+casio.sub(x, y));
		System.out.println("multiplication..."+casio.mul(x, y));
		System.out.println("division..."+casio.div(x, y));
		System.out.println("modulus.."+casio.mod(x,y));

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
