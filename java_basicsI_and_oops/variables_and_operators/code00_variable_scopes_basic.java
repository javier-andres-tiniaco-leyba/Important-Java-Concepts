// Scope: refers to the region of the program
// to which an identifier applies. Scope of variables example

class Scope {
	boolean b = true; // b1 has scope of entire class
	int x = 88;       // x1 has scope of entire class

	public static void main(String[] args) {
		Scope s = new Scope();
	}

	Scope() {
		double d = 9.0;
		example(d);
		variablesMethod();
	}

	void example(double x) { //parameter x2 has scope of this method
		System.out.println("-----example(double x):\n" +
				"Initial value of Local variable 'x' :" + x + "\n");

		x = 4.4; // reassign value of Local variable x2

		System.out.println("New value of Local Variable 'x': " + x + "\n");

		for(int b = 0; b < 4; b++) { //b2 has scope of this loop
			int i = b + 4; // begin scope of int i
			System.out.println("For loop 1 in example(double x):\n" +
				"Local variable 'b' (local to loop): " + b + "\n" +
				"Local variable 'i' (local to loop): " + i + "\n" +
				"Local variable 'x' (method parameter): " + x + "\n");
		} // end of scope of int b2; end of scope of int i

		for(int b=0; b<4; b++) {
			x = b;
			System.out.println(	"For Loop 2 in example(double x):\n"
                +	"Local Variable `b` (local to loop): " + b + "\n"
                +	"Local Variable `x` (method parameter): " + x + "\n");
		}

		System.out.println("Local variable 'x' after loop 2: " + x + "\n");

	}// end of scope of double x2


	void variablesMethod() {
		System.out.println("----- variablesMethod():\n" +
						"Instance Variable 'b': " + b + "\n"+
						"Instance Variable 'x': "+ x);
	}
} // end of boolean b's scope; end of int x's scope
