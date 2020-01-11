// Automatic memory management through JVM garbage collector
class GarbageCollectionExample {

	public static void main(String[] args) {
    	/* Here we are intentionally assigning a null
         * value to a reference so that the object becomes
         * non reachable
    	*/
		GarbageCollectionExample obj = new GarbageCollectionExample();
		obj = null;

		/* Here we are intentionally assigning reference a
        * to the another reference b to make the object referenced
        * by b unusable.
        */
		GarbageCollectionExample a = new GarbageCollectionExample();
		GarbageCollectionExample b = new GarbageCollectionExample();
		b = a;

    	// Call the JVM garbage collector
    	System.gc();
	}

	// This method will be called when the obj is garbage collected
	public void finalize() throws Throwable {
	    super.finalize();
		System.out.println("Garbage collection is perfomed by JVM");
    }
}
