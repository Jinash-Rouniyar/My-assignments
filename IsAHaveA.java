package first_project;

public class IsAHaveA {

	public static void main(String[] args) {
		Sun sobj = new Sun();
		sobj.obj.atoms();
		sobj.obj.obj1.conversion();
		
		Energy_Type eobj = new Energy_Type();
		

	}

}
class Star{
	Star(){
		System.out.println("Stars are some of the brightest object in the universe");
	}
}
class Sun extends Star{
	Hydrogen obj = new Hydrogen();
	
	 Sun(){
		System.out.println("Sun is one of the brighest star in the night sky");
	}
}

class Hydrogen {
	Energy obj1 = new Energy();
	void atoms() {
		System.out.println("Sun contains a lot of hydrogen atoms");
	}
}

class Energy{
	String released = "Light + Heat+ UV";
	void conversion() {
		System.out.println("Hydrogen converted to helium release energy");
	}
}

class Energy_Type extends Energy{
	Energy_Type(){
	System.out.println("Energy radiated towards earth are: " + super.released);
	}
	
}