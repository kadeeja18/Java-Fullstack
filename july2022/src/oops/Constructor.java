package oops;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Human();
new Giraffe();
new Whale();
	}

}
class Human{
	public Human() {
		System.out.println("Human should cry");
	}
}
class Giraffe{
	public Giraffe() {
		System.out.println("Giraffe can run");
	}
}
class Whale{
	public Whale() {
		System.out.println("Whale can swim");
	}
}
