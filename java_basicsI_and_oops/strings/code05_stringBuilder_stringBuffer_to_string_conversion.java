// Java program to demonstrate conversion from
// String to StringBuffer and StringBuilder.

class Test {
	public static void main(String[] args) {
		StringBuffer sbr = new StringBuffer("GeeksBuffer");
		StringBuilder sbl = new StringBuilder("GeeksBuilder");

		// conversion from StringBuffer object to String
		String str = sbr.toString();
		System.out.println(str);

		// conversion from StringBuilder object to String
		String str1 = sbl.toString();
		System.out.println(str1);

	}
}
