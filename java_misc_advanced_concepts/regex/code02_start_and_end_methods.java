import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexMatches {

    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";

    public static void main(String[] args) {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT);   // get a matcher object
        int count = 0;

        while(m.find()) {
            count++;
            System.out.format("Match number %s%n", count);
            System.out.format("String matched: %s%n",
                INPUT.substring(m.start(),m.end()));
            System.out.format("start(): %s%n", m.start());
            System.out.format("end(): %s%n", m.end());
        }
    }
}
