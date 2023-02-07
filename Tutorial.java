package Tutorials;
public class Tutorial {
	public static void main(String[] args) {
		Highest obj = new Highest();
		obj.highestValue(5, 4, 8);
	    }
	}
class Highest{
 public void highestValue(int a, int b, int c) {
	 if (a>b && a>c) {
		 System.out.println("a is greatest");
	 }
	 else if (b>a && b>c) {
		 System.out.println("a is greatest");
	 }
	 else {
		 System.out.println("c is greatest");
	 }
	
 }
}