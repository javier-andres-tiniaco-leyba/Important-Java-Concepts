// javac -d bin code20...
// java -cp bin -Dhello=world Test
// Java -D option allows to set properties of the environment
// https://docs.oracle.com/javase/8/docs/api/java/lang/System.html

class Test {
    public static void main(String[] args) throws InterruptedException {
        String property = "hello";
        System.out.println(
            String.format("%s=%s",property,System.getProperty(property))
        );

        System.out.println("\n\nEnvironment properties:");
        java.util.Properties properties = System.getProperties();
        properties.list(System.out);

        System.out.println("\n\nEnvironment variables:");
        java.util.Map<String,String> env = System.getenv();
        env.forEach((k,v)->System.out.println(
            String.format("%s = %s\n",k,v)));
    }
}
