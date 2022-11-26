class Interview1 {
	// method overriding
	public void ans() {
		System.out.println("What is your name?");
	}
}

class Interview2 extends Interview1 {
	public void ans() {
		super.ans();
		System.out.println("My name is Varsha");
	}
}

class Poly {
	// method overloading
	public void num(char m) {
		for (int i = 0; i < 20; i++)
			System.out.print(m);
	}

	public void num() {
		System.out.print("Loading..");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		Interview2 a = new Interview2();
		a.ans();
		Poly c = new Poly();
		c.num('-');
		System.out.println();
		c.num();
	}
}