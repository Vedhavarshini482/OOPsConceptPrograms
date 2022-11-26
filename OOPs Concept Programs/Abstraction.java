abstract class Mobiles {
	int a;

	Mobiles(int a, int b) {
		// this is not possible in interface
		this.a = a;
	}

	public void method() {
		// this is not possible in interface
	}

	abstract void powerbutton();

}

class Redmi extends Mobiles {
	Redmi() {
		super(2, 5);
	}

	public void powerbutton() {
		System.out.println("Redmi \n  by Xiaomi");
	}
}

class Samsung extends Mobiles {

	Samsung() {
		super(2, 9);

	}

	public void powerbutton() {
		System.out.println("SAMSUNG \n  Secured by Knox");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Mobiles mi = new Redmi();
		mi.powerbutton();
		Samsung s = new Samsung();
		s.powerbutton();
	}
}