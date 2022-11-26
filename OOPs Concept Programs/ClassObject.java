class Formula {
	public static int number = 1;
	public int number2 = 10;

	int square(int side) {
		return side * side;
	}

	int square(float side) {
		side = (int) 5;
		return (int) side * (int) side;
	}

	int rectangle(int length, int breadth) {
		return length * breadth;
	}

	int triangle(int base, int height) {
		return (base * height) / 2;
	}
}

public class ClassObject {
	public static void main(String[] args) {
		Formula f = new Formula();
		Formula f1 = new Formula();
		Formula f2 = new Formula();
		System.out.println(Formula.number++);// f.number++
		System.out.println(Formula.number++);// f1.number++
		System.out.println(Formula.number++);// f2.number++
		System.out.println(f.number2++);
		System.out.println(f.number2++);
		System.out.println(f1.number2++);
		System.out.println(f2.number2++);
		System.out.println(Formula.number);
		System.out.println(f.square(4));
		System.out.println(f.rectangle(2, 5));
		System.out.println(f.triangle(3, 6));
	}
}