interface Rules {
	void dresscode();

	void timing();

	void workingdays();
}

class School implements Rules {
	public void dresscode() {
		System.out.println("Dresscode : Only Uniform");
	}

	public void timing() {
		System.out.println("Timing : 8:30AM to 4:30PM");
	}

	public void workingdays() {
		System.out.println("Working days : 210 days\n");
	}
}

class Tuition implements Rules {
	public void dresscode() {
		System.out.println("Dresscode : Any neet dresscode");
	}

	public void timing() {
		System.out.println("Timing : 6:00PM to 8:30PM");
	}

	public void workingdays() {
		System.out.println("Working days : All days\n");
	}
}

class Office implements Rules {
	public void dresscode() {
		System.out.println("Dresscode : Employees wish");
	}

	public void timing() {
		System.out.println("Timing : 10:00AM to 7:00PM");
	}

	public void workingdays() {
		System.out.println("Working days : Except Sunday\n");
	}
}

public class Interface2 {

	public static void main(String[] args) {
		System.out.println("For Schools");
		Rules rule = new School();
		rule.dresscode();
		rule.timing();
		rule.workingdays();
		System.out.println("For Tuition");
		rule = new Tuition();
		rule.dresscode();
		rule.timing();
		rule.workingdays();
		System.out.println("For Office");
		rule = new Office();
		rule.dresscode();
		rule.timing();
		rule.workingdays();
	}
}