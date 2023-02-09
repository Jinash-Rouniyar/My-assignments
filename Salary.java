package Tutorials;

public class Salary {
	public static void main (String[] args) {
		SalaryClass obj = new SalaryClass();
		obj.setValue(260000);
	}
}
class SalaryClass{
	private float s;
	public void setValue(int s) {
		this.s = s;
		printValue();
	}
	public void printValue() {
	if (s>0 && s<50000) {
		System.out.println("Low scale salary");
		}
	else if(s>50000 && s<3500000) {
		System.out.println("Medium Scale salary");
	}
	else if (s>350000000) {
		System.out.println("High scale salary");
	}
	else {
		System.out.println("Wrong input");
	}
	}
}
