interface Ig1 {
	void post();
}

interface Ig2 {
	void like();
}

interface Ig3 {
	void comment();

}

class Instagram implements Ig1, Ig2, Ig3 {
	public void post() {
		System.out.println("Total Posts : 10");
	}

	public void like() {
		System.out.println("Total Likes : 100");
	}

	public void comment() {
		System.out.println("Total Comments : 50");
	}
}

public class Interface {

	public static void main(String[] args) {
		Instagram acc = new Instagram();
		acc.post();
		acc.like();
		acc.comment();
	}
}