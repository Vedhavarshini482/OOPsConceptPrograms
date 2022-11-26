interface Animal {

	void sound1();

	void sound2();
}

interface Cat extends Animal {

	void print();
}

interface Dog extends Animal {
	void prints();
}

public class Interface4 implements Cat, Dog {

	public static void main(String[] args) {
		Interface4 i = new Interface4();
		i.print();
		i.sound1();
		i.prints();
		i.sound2();
	}

	public void print() {
		System.out.print("I'm a Cat -");
	}

	public void sound1() {
		System.out.println(" Meow Meow");
	}

	public void prints() {
		System.out.print("I'm a Dog -");
	}

	public void sound2() {
		System.out.println(" Woof Woof");
	}
}