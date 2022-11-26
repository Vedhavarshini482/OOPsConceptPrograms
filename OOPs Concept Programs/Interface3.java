interface Schl {
	void lunch();

	void breaktime();

	void games();
}

interface HomeTuition {
	void study();

	void test();
}

class Student implements Schl, HomeTuition {
	public void lunch() {
		System.out.println("Now lunchtime");
	}

	public void breaktime() {
		System.out.println("Breaktime after lunch");
	}

	public void games() {
		System.out.println("Now I'm playing ball badminton");
	}

	public void study() {
		System.out.println("I'm studying");
	}

	public void test() {
		System.out.println("Tomorrow Quarterly test");
	}
}

public class Interface3 {

	public static void main(String[] args) {
		Student student = new Student();
		student.lunch();
		student.breaktime();
		Schl schl = new Student();
		schl.games();
		HomeTuition homeTuition = new Student();
		homeTuition.test();
		student.study();
	}
}