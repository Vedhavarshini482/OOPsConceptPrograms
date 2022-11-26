class Professor {
	String name;
	int experience;
	String subject;
	int salary;

	Professor(String n, int e, String sub, int sal) {
		name = n;
		experience = e;
		subject = sub;
		salary = sal;
	}

	Professor() {
		name = " ";
		experience = 0;
		subject = "";
		salary = 0;
	}

	public void display() {
		System.out.println("Name : " + name + "\nExperience : " + experience
				+ "\nSubject : " + subject + "\nSalary : " + salary);
	}
}

class Principal extends Professor {
	int bonus;

	Principal(String n, int e, String sub, int sal, int b) {
		super(n, e, sub, sal);/*
							 * If we comment this -->super(n,e,sub,sal); and
							 * comment Professor constructor without
							 * parameters -->Implicit super constructor
							 * Professor() is undefined. Must explicitly invoke
							 * another constructor
							 */
		bonus = b;
	}

	public void display() {// method overriding
		super.display();
		System.out.println("Bonus : " + bonus);
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		Professor p1 = new Professor("Staff", 5, "Physics", 12000);
		p1.display();
		System.out.println();
		p1 = new Principal("Pricipal1", 13, "Chemistry", 40000, 5000);
		p1.display();
		System.out.println();
		Principal p2 = new Principal("Principal2", 17, "Maths", 50000, 10000);
		p2.display();
		System.out.println();
	}
}