class Recurse {

    public static void main(String[] args) {
        // Real string for CLI
        String s = args[0];

        // Direct print string one char per line
        System.out.println("Printing passed string");
        printString(s);

        // Print reversed string one char per line
        System.out.println("Printing reversed string");
        printBackward(s);

        // Print reversed string in one line
        System.out.println("Printing reversed string");
        System.out.println(reverseString(s));
    }

    public static char first(String s){
        return s.charAt(0);
    }

    public static String rest(String s){
        return s.substring(1, s.length());
    }

    public static int length(String s){
        return s.length();
    }

    public static void printString(String s){
        if(length(s)==2){
            System.out.println(first(s));
            System.out.println(rest(s));
        }
        else{
            System.out.println(first(s));
            // printString(s); // Try this to get an error and see why
            printString(rest(s));
        }
    }

    public static void printBackward(String s) {
        if(length(s) == 2){
            System.out.println(rest(s));
            System.out.println(first(s));
        }
        else{
            printBackward(rest(s));
            System.out.println(first(s));
        }
    }

    public static String reverseString(String s) {
        if(length(s) == 2){
            return rest(s) + first(s);
        }
        else{
            return reverseString(rest(s)) + first(s);
        }
    }
}