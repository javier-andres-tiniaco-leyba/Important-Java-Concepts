interface Sayable {
    public String say(String name);
}

class Test {
    public static void main(String[] args) {
        // Lambda expression with single parameter.
        Sayable s1 = (name) -> {
            return "Hello, " + name;
        };
        System.out.println(s1.say("aahh"));

        // You can omit function parentheses if there is only 1 parameter
        Sayable s2 = name -> {
            return "Hello, "+name;
        };
        System.out.println(s2.say("Heee"));
    }
}
