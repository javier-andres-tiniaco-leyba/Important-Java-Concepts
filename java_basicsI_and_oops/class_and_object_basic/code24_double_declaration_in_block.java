class Test {
	public static void main(String[] args) {
		{
			int x = 5;
			{   // same problem as in a loop. see code 23
				int x = 10;
				System.out.println(x);
			}
		}
	}
}
