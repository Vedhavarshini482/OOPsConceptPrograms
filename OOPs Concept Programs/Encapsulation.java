class Area {
	private int length;
	private int breadth;

	public void setlength(int length) {
		this.length = length;
	}

	public void setbreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getArea() {
		int area = length * breadth;
		return area;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Area a = new Area();
		a.setlength(7);
		a.setbreadth(8);
		System.out.println("Area : " + a.getArea());
	}
}