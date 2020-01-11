class Finalize {
	public static void main(String[] args) throws Throwable {
		/* Now, generate a large number of objects. At
		some point, garbage collection will occur.
		Note: you might need to increase the number
		of objects generated in order to force
		garbage collection. Notice how object garbage collection
        is not perfomed in the order in which instances were created.*/
		FDemo ob = new FDemo(0);
		for(int count = 1; count < 1000000; count++)
			ob.generator(count);
		}
}

class FDemo {
	int x;
	FDemo(int i) {
		x = i;
	}
	// called when object is recycled
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Finalizing " + x);
	}
	// generates an object that is immediately destroyed
	void generator(int i) {
		FDemo o = new FDemo(i);
	}
}
