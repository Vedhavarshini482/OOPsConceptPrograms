class Employees {
	String name;
	int age;
	int salary;

	String getname(String n) {
		return name;
	}

	int getage(int a) {
		return age;
	}

	int getsalary(int s) {
		return salary;
	}

	void setname(String n) {
		name = n;
	}

	void setage(int a) {
		age = a;
	}

	void setsalary(int s) {
		salary = s;
	}

	public void display() {
		System.out.println("Name : " + name + "\nAge : " + age + "\nSalary : "
				+ salary);
	}
}

class Manager extends Employees {
	int bonus;

	int getbonus(int b) {
		return bonus;
	}

	void setbonus(int b) {
		bonus = b;
	}

	public void display() {// method overriding
		super.display();
		System.out.println("Bonus : " + bonus);
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		Employees e = new Employees();
		e.setname("Employee1");
		e.setage(21);
		e.setsalary(20000);
		e.display();
		System.out.println();
		e = new Manager();
		e.setname("Employee2");
		e.setage(22);
		e.setsalary(30000);
		/* e.setbonus(200); The method setbonus(int) is undefined for the type
		 Employees*/
		e.display();
		System.out.println();
		Manager m = new Manager();
		m.setname("Manager");
		m.setage(25);
		m.setsalary(45000);
		m.setbonus(10000);
		m.display();
		System.out.println();
	}
}
