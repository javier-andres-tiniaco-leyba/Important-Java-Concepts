// Literal: any constant value that can be assigned to a variable.
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

class Test {
    public static void main(String[] args) {
        // integer literals
        int u = 0b1010; // binary numbers have 0b as prefix
        int x = 100;    // 100 is a constant/literal
        int y = 0144;   // octal numbers have 0 as prefix
        int z = 0xFF;   // Hexadecimal numbers have 0x as prefix
        System.out.println(String.format("%s %s %s %s",u,x,y,z));
        // every integer literal is implicitly int type
        // long can be specified by using L or l as suffix.
        // Byte or short can not be explicitly specified, but
        // they are implicitly set when an integer literal is assigned
        // to a short or byte type
        long  a = 3L;
        short b = 4;
        byte  c = 5;
        System.out.println(String.format("%s %s %s",a,b,c));

        // Floating point literals: they are double by default. They can be
        // suffixed with d or D for double but by convention evert floating
        // point literal is double, so in order to assign a floating point
        // to a float (down-casting) explicit typecasting is needed
        // or the f or F suffix is necessary.
        // Only base 10 numbers can be used:
        float  a1 = (float)101.230;// decimal-form literal
        float  b1 = 0123.222f;     // It also acts as decimal literal
        double c1 = 23.4D;         // D or d = double literal
        double d1 = 42.1d;
        double e1 = 1.234e2;       // 123.4 Scientific notation
        // float c1 = 0x123.222;   // Error: malformed floating point literal
        System.out.println(String.format("%s %s %s %s %s",a1,b1,c1,d1,e1));

        // The char data type is a single 16-bit Unicode character.
        // '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive)
        // char literals: for char datatype literals can be specified in 4 ways:
        // single quote.
        char ch1 = 'a';
        // char as integral literal: represents unicode value
        // can be specified in decimal, octal or hexadecimal form
        char ch2 = 062;
        // Unicode representation: uxxxx where Xs are hexadecimal digits
        char ch3 = '\u0061';
        // Escape sequence: Escape character as as char literal
        // java allows for
        char ch4 = '\n'; //(line feed) Notice how a line feed is inserted
        System.out.println(String.format("%s %s %s %s",ch1,ch2,ch3,ch4));

        // String literals: Any sequence of characters within double quotes is
        // treated as String literals.String literals may not contain unescaped
        // newline or linefeed characters
        // char and String may contain any Unicode (UTF-16) characters.
        String s = "Hello";

        // boolean literals are either true or false but not integers
        boolean bool1 = true;
        boolean bool2 = false;
        // error: incompatible types: int cannot be converted to boolean
        // boolean bool3 = 0;
        // boolean bool4 = 1;

        // ASCII value of 0 is 48
        int first = '0';
        // ASCII value of 7 is 55
        int second = '7';
        int third = '\u016A';
        System.out.println("Mixed: " + first + ' ' + second + ' ' + (char)third);

        // class literal: formed by adding .class to a Class name
        Class cls = Test.class;

        // Underscores can be used since java 7 in numeric literals to improve
        // readability. They can only be places within digits. Once printed,
        // the underscores are ignored.
        long cardNumber = 333_232_333L;
        System.out.println(cardNumber);
    }
}
