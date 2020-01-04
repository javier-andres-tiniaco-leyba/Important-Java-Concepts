import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexMatches {

    private static final String REGEX = "foo";
    private static final String INPUT = "fooooooooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;

    public static void main(String[] args) {
        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);

        System.out.format("Current REGEX is: %s%n",REGEX);
        System.out.format("Current INPUT is: %s%n",INPUT);

        System.out.format("lookingAt(): %s%n",matcher.lookingAt());
        System.out.format("matches(): %s%n",matcher.matches());
    }
}
