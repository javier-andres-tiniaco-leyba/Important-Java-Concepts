// Number class wrapper
// Convert a primitive data type to an object using Number class (boxing)
// Convert number object to a primitive data type (unboxing)

// Number Wrapper Classes:
// Byte, Short, Integer, Long, Float, Double

class NumberClass {
    public static void main(String[] args) {
        Integer x = 5; // boxes int to an Integer Object

        // xxxValue number method. Unbox number to a primitive data type specified
        System.out.println("Number X object to byte primitive: " + x.byteValue());
        System.out.println("Number X object to short primitive: " +x.shortValue());
        System.out.println("Number X object to int primitive: " +x.intValue());
        System.out.println("Number X object to long primitive: " +x.longValue());
        System.out.println("Number X object to float primitive: " +x.floatValue());
        System.out.println("Number X object to double primitive: " +x.doubleValue());

        // Unboxes the integer to a int
        x += 5;
        System.out.println("Integer Object unboxed: " + x);

        // parseInt
        int y = Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int z = Integer.parseInt("444", 16);
        System.out.println(y);
        System.out.println(c);
        System.out.println("444 Integer parsed as hexadecimal int:"+z);

        // toString
        Integer w = 5;
        System.out.println(w.toString());
        System.out.println(Integer.toString(12));
    }
}
