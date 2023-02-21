package Assignments;


public class Interface_Assignment {

	public static void main(String[] args) {
		Person obj = new Person();
		obj.talk();
		obj.walk();
		System.out.println("____________");
		
		Athlete obj1 = new Athlete();
		obj1.run();
		obj1.exercise();
		System.out.println("____________");
		
		MMA_Fighter obj2 = new MMA_Fighter();
		obj2.talk();
		obj2.kickboxing();
		obj2.grappling();
	}
}
interface human_skills{
	void walk();
	void talk();
}
interface athletic_skills{
	void run();
	void exercise();
}
interface fighting_skills{
	void kickboxing();
	void grappling();
}
class Person implements human_skills{
	public void walk() {
		System.out.println("A person can walk");
	}
	public void talk() {
		System.out.println("A person can talk");
	}
}
class Athlete extends Person implements human_skills,athletic_skills{
	public void run() {
		System.out.println("An athlete can run well");
	}
	public void exercise() {
		System.out.println("An athlete can exercise");
	}
}
class MMA_Fighter extends Athlete implements human_skills,athletic_skills,fighting_skills{
	public void talk() {
		System.out.println("MMA fighter must be a charismatic talker");
	}
	public void kickboxing() {
		System.out.println("MMA fighter must have good kickboxing skills");	
	}
	public void grappling() {
		System.out.println("MMA fighter must be a submission specialist");
		
	}
	
}
