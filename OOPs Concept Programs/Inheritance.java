class Popular {
	String hotel;

	public void hotel() {
		System.out.println(hotel + " hotel is Popular in Rajapalayam");
	}
	public void method(){
		System.out.println("HI");
	}
}

class Rjpm extends Popular {

	public void hotel() {
		super.hotel();
		System.out.println("Parotta is a Popular food in " + hotel + " hotel");
	}

	String animal;

	public void animal() {
		System.out.println(animal
				+ " is a Popular domestic animal in Rajapalayam");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Rjpm rj = new Rjpm();
		//Popular pop=new Popular();
		//pop.animal();
		//Rjpm r=new Popular();
		rj.hotel = "Muthu";
		Popular p = rj;
		Rjpm rj1 = (Rjpm) p;
		// Rjpm rj2 = (Rjpm)new Popular();//--> class cast
							// Exception
		rj1.hotel = "Muthu";
		rj1.hotel();
		rj1.animal = "dog";
		rj1.animal();
	}
}