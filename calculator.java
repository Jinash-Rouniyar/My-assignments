package Tutorials;

public class calculator {
	public static void main(String[] args) {
	Interest obj = new Interest(1000,3,5);
	obj.SimpleInterest();
	obj.CompoundInterest();
	}
}
class Interest{
	private double p;
	private double t;
	private double r;
	Interest(double a, double b, double c){
		p=a;
		t=b;
		r=c;
	}
	public void SimpleInterest() {
		System.out.println("The simple interest is: " + (p*t*r)/100);
	}
	public void CompoundInterest() {
		System.out.println("The compound interest is :" + (p*Math.pow(1+r/100,t)-p));
	}
}