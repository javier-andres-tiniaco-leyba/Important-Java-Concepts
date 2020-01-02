// Object methods:
// clone, equals, finalize, getClass, hashCode,
// notify, notifyAll, toString, wait

class ObjectExample1 {

    public static void main(String[] args) {
        Object o = new Object();
        String s = "hello";

        System.out.println(
            s.getClass().getName() + "@" + Integer.toHexString(s.hashCode()));
        System.out.println(s);

        System.out.println(o.toString());
        System.out.println(
            o.getClass().getName() + "@" + Integer.toHexString(o.hashCode()));
        System.out.println(o);

    }

}
