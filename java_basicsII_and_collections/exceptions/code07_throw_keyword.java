// RuntimeException are part of checked exceptions,so they are
// not subject to the catch or specify requirement,which is
// why validate method neither catch not specifies
// ArithmeticExeption.
class TestThrow1 {

    static void validate(int age) {
        if(age<18)
            throw new ArithmeticException("Invalid Age.");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("rest of the code...");
    }
}
