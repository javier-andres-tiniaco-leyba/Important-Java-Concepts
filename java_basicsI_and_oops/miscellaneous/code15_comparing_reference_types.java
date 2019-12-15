// https://docs.oracle.com/javase/8/docs/api/
// https://www.oreilly.com/library/view/java-8-pocket/9781491901083/ch04.html

// Reference types are comparables. Equality operators and the equals
// method can be used to assist with comparisons.

// the == and != equality operators are used to compare the memory location
// of two objects, which is different to object equivalence, that is
// tested with the equals method.

//  When reference types are copied, either a copy of the reference to an
// object is made, or an actual copy of the object is made, creating an new object.
// The latter is referred to as cloning in java.

class CrapClass{
  private int x;
  CrapClass(int x){
    this.x = x;
  }
  // Implemented for equivalence
  public boolean equals(CrapClass another){
    return this.x == another.x;
  }
}

class TestCrapObject{
  public static void main (String[] args){
    CrapClass c1 = new CrapClass(4);
    CrapClass c2 = c1;
    CrapClass c3 = new CrapClass(4);
    // c2 reference type points to the same adress as c1 -> (same object)
    System.out.println("c1 == c2: " + (c1 == c2));
    System.out.println("c1 == c3: " + (c1 == c3));
    System.out.println("c1.equals(c3): " + c1.equals(c3));
  }
}
