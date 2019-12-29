// Java static property is shared to all objects.
// It makes your program memory efficient (i.e it saves memory).
// Program of static variable. The static variable gets memory only
// once in class area at the time of class loading.

// Program to get cube of a given number by static method

class Calculate{
    static int cube(int x) {
        return x*x*x;
    }

    public static void main(String[] args) {
        int result=Calculate.cube(5);
        System.out.println(result);
    }
}
