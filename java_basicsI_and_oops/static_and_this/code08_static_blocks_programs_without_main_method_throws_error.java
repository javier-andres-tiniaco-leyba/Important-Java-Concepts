// Program of static block. Is used to initialize the static data member.
// It is executed before main method at the time of classloading.

// It was possible to execute programs without the main method (before JDK7).
// But it is not allowed since JDK7 and throws ERROR

class A3 {

    // ERROR : Main method not found
    static{
        System.out.println("static block is invoked");
        System.exit(0);
    }
}
