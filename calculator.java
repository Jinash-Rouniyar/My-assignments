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
	Interest(double p, double t, double r){
		this.p=p;
		this.t=t;
		this.r=r;
	}
	public void SimpleInterest() {
		System.out.println("The simple interest is: " + (p*t*r)/100);
	}
	public void CompoundInterest() {
		System.out.println("The compound interest is :" + (p*Math.pow(1+r/100,t)-p));
	}
}
