// https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value?page=1&tab=votes#tab-top

// Notice how even though operations objects inside changeOp methods
// are set to point to something different, after the method, they
// have the same hashCode, which means that the objects were
// passed by value. The thing is that only the reference to the object
// was passed and is was is copied, not the content of the object itself.

class Operation {

    int data = 50;
    Object op = new Object();

    void changeOp(Operation oper) {
        oper = new Operation();
    }

    public static void main(String[] args) {
        Operation op1 = new Operation();
        Operation op2 = new Operation();

        printHashes(op1, op2);

        op1.changeOp(op2);
        op2.changeOp(op1);

        System.out.println("Operation hashes after being passed to method:");
        printHashes(op1, op2);
    }

    static void printHashes(Operation op1, Operation op2) {
        System.out.println(
            String.format("op1 hashCode: %s, op2 hashCode:%s",
            op1.hashCode(),op2.hashCode()));

        System.out.println(
            String.format("op1.op hashCode: %s, op2.op hashCode:%s",
            op1.op.hashCode(),op2.op.hashCode()));
    }
}
