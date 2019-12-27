class WrapperExample2 {
    public static void main(String[] args) {
    //Converting Integer to int
    Integer a = new Integer(3);
    //Converting Integer to int
    int i = a.intValue();
    //Unboxing, now compiler will write a.intValue() internally
    int j = a;
    System.out.println(a+" "+i+" "+j);
    }
}
