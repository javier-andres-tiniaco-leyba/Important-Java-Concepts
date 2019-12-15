// https://docs.oracle.com/javase/tutorial/java/IandI/super.html

class D {
    D(int c){
        //nothing
    }
}
class E extends D{
    E() {
        System.out.println("This is E");
    }
}

// This fails to compile because the compiler implicitly tries to insert a call
// to the superclass no-argument constructor in the subclass constructor,
// since it does not find one, if fails to compile
class Test {
    public static void main(String[] args) {
        // Notice how the compiler tries to find and call a no-argument
        // constructor from the superclass of E
        new E();
    }
}


// There would be no problem if E did not have a constructor and did not extend
// D, since every class in java implicitly inherits from Object class
// if it does not extends any other class, and object does hava a
// no-argument constructor
