@FunctionalInterface  //It is optional
interface Sayable {
    public String say();
}

class LambdaExpressionExample1{
    public static void main(String[] args) {
        Sayable s = () -> {
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
