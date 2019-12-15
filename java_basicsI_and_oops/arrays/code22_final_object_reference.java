// Program 2
class Test {
	int p = 20;
	public static void main(String[] args) {
		final Test t1 = new Test();
		Test t2 = new Test();
		t1 = t2;
		System.out.println(t1.p);
	}
}

// This does not compile because the object to which t1 points to
// is trying to be changed
