// A variable defined within a block inside a method
// is only visible within the block. (Think of blocks in loops)

class Test {
	public static void main(String[] args) {
		{
			// The variable x has scope within brackets - block
			int x = 10;
			System.out.println(x);
		}

		// Uncommenting below line would produce
		// error since variable x is out of scope.

		System.out.println(x);
	}
}
