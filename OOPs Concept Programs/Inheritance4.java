class Grandfather {
	String name;
	int age;

	Grandfather(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

class Father extends Grandfather {
	String work;

	Father(String name, int age, String work) {
		super(name, age);
		this.work = work;
	}
}

class Son extends Father {
	int salary;

	Son(String name, int age, String work, int salary) {
		super(name, age, work);
		this.salary = salary;
	}
}

public class Inheritance4 {

	public static void main(String[] args) {
		Grandfather gf = new Grandfather("A", 79);
		System.out.print("My name is " + gf.name + ".\nI'm " + gf.age
				+ " years old.\n");
		gf = new Father("B", 46, "Hotel");
		System.out.print("My Son " + gf.name + ".\nHe is " + gf.age
				+ " years old.\n");
		Father f = new Father("B", 46, "Hotel");
		System.out.print("He runs his " + f.work + " successfully.");
		f = new Son("C", 26, "Government Employee", 40000);
		System.out.print("\nHis son name is " + f.name + ".\nHe is now "
				+ f.age + " and he is a " + f.work);
		Son s = new Son("C", 26, "Government Employee", 25000);
		System.out.print(".\nHe earns " + s.salary + " per month.");
	}
}