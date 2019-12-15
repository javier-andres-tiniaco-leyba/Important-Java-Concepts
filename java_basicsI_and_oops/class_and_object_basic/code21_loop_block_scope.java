class Test {
	public static void main(String[] args) {
		for (int x = 0; x < 4; x++) {
			System.out.println(x);
		}

		// Will produce error: can not find symbol
		System.out.println(x);
	}
}

// If we want to keep the x value after the loop,
// it should be declared before it, see code 22
