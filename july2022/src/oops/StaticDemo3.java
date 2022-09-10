package oops;
public class StaticDemo3 {
	
	/*
	 * Static - block
	 * Static - variable - class variable
	 * Static - Method
	 * Static - inner class
	 *
	 * the jvm creates objects for the static and it is created only once
	 */
	public static void main(String[] args) {
		TrainingRoom gandhi=new TrainingRoom();
		TrainingRoom nehru=new TrainingRoom();
		
		System.out.println(TrainingRoom.sulab);//class variables are accessed by there class names directly
	}
}
class TrainingRoom{
	Projectorr sanyo=new Projectorr();//instance variable
	static Toilet sulab=new Toilet();//class variable
}
class Projectorr{
	public Projectorr() {
		System.out.println("project object created....");
	}
}
class Toilet{
	public Toilet() {
		System.out.println("toilet object created.....");
	}
}