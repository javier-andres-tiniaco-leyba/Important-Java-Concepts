import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexMatches {

    public static void main(String[] args) {
        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);

        int groupCount = m.groupCount();

        System.out.format("Group Count =%s%n ", groupCount );

        if (m.find()) {
            System.out.format("Found value: %s%n", m.group(0));
            System.out.format("Found value: %s%n", m.group(1));
            System.out.format("Found value: %s%n", m.group(2));
            System.out.format("Found value: %s%n", m.group(3));
        } else {
            System.out.format("NO MATCH");
        }
    }
}
