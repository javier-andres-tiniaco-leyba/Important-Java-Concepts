// https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value?page=1&tab=votes#tab-top
// Program to demonstrate that Java is Pass-By-Value and NOT Pass-By-Reference
// Notice how after swap colors inside Baloon objects are the same, bacause
// the value of the reference to the objects is copied, not the objects
// actual objects.

class Balloon {

	private String color;

	public Balloon() {}

	public Balloon(String color){
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class Test {

	public static void main(String[] args) {

		Balloon red = new Balloon("Red"); //memory reference 50
		Balloon blue = new Balloon("Blue"); //memory reference 100

		swap(red, blue);
		System.out.println("red color="+red.getColor());
		System.out.println("blue color="+blue.getColor());

		foo(blue);
		System.out.println("blue color="+blue.getColor());
	}

	private static void foo(Balloon balloon) { //baloon=100
		balloon.setColor("Red"); //baloon=100
		balloon = new Balloon("Green"); //baloon=200
		balloon.setColor("Blue"); //baloon = 200
	}

	//Generic swap method
	public static void swap(Object o1, Object o2) {
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	}
}
