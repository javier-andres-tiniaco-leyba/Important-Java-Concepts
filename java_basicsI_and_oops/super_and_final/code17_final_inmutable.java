// https://docs.oracle.com/javase/tutorial/java/IandI/final.html

// A class can be declared final, final classes can not be extended
// trying to do so will throw a compile time error.
// the String class is defined as final, and thus can not be extended.

// Try uncommenting A class and compiling
// class A extends String {
//     // nothing
// }

final class B {}

class C extends B {}
