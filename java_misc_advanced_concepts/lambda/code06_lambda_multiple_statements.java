interface Sayable {
    String say(String message);
}

class Test {
    public static void main(String[] args) {
        // You can pass multiple statements in lambda expression
        Sayable person = message -> {
            String str1 = "I would like to say, ";
            String str2 = String.format("%s %s",str1,message);
            return str2;
        };
        System.out.println(person.say("time is precious."));
    }
}
