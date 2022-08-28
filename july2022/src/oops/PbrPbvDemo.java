package oops;

public class PbrPbvDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student rahim = new Student();
String word = "Indira Gandhi";
System.out.println("Before primitive..."+word);
rahim.whisper(word);
System.out.println("After primitive..."+word);
Sugar sugar = new Sugar();
System.out.println("b4 complex..."+sugar.weight);
rahim.acceptSugar(sugar);
System.out.println("After  complex..."+sugar.weight);


	}

}
class Sugar{
	 int weight = 100;
}
class Student{
//pass by reference
	public void acceptSugar(Sugar s) {
		s.weight = s.weight-10;
	}
//	pass by value
	public void whisper(String word) {
		word = "rhino";
	}
}
