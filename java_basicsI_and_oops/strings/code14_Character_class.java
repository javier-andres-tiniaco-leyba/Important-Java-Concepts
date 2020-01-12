class CharacterTest {

    public static void main(String[] args) {
        System.out.println("before tab\tAfter tab");
        System.out.println("before backspace\bAfter");
        System.out.println("before newline\nAfter");
        System.out.println("before carriage return\rafter");
        System.out.println("before form feed\fafter");

        //isLetter
        System.out.println("Character.isLetter('c'):" +Character.isLetter('c'));
        System.out.println("Character.isLetter('5'):"+Character.isLetter('5'));

        //isDigit
        System.out.println("Character.isDigit('c'):" +Character.isDigit('c'));
        System.out.println("Character.isDigit('5'):"+Character.isDigit('5'));

        //isWhitespace
        System.out.println("Character.isWhitespace('c'):" +Character.isWhitespace('c'));
        System.out.println("Character.isWhitespace(' '):"+Character.isWhitespace(' '));

        //isUpperCase
        System.out.println("Character.isUpperCase('c'):" +Character.isUpperCase('c'));
        System.out.println("Character.isUpperCase('C'):"+Character.isUpperCase('C'));

        //isLowerCase
        System.out.println("Character.isLowerCase('c'):" +Character.isLowerCase('c'));
        System.out.println("Character.isLowerCase('C'):"+Character.isLowerCase('C'));

        //toLowerCase
        System.out.println("Character.toLowerCase('C'):" +Character.toLowerCase('C'));
        //toUpperCase
        System.out.println("Character.toUpperCase('C'):" +Character.toUpperCase('c'));

        // indexOf
        System.out.println("\"fruit\".indexOf('t'): " + "fruit".indexOf('t'));
        System.out.println("\"fruit\".indexOf('c'): " + "fruit".indexOf('c'));
    }
}

// char
// isDigit, isLetter, isWhitespace, isLowerCase, isUpperCase, toLowerCase, toUpperCase
// String:
// charAt, indexOf, compareTo, equals
