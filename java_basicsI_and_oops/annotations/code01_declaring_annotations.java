// Many annotations replace comments in codes
// https://docs.oracle.com/javase/tutorial/java/annotations/declaring.html

import java.lang.annotation.Documented;

@Documented
@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    String[] reviewers();
}

@ClassPreamble(
    author = "John Doe",
    date = "3/17/2009",
    currentRevision = 6,
    lastModified = "4/17/2009",
    lastModifiedBy = "Jane Doe",
    reviewers = {"Bob", "Cindy", "Mandy"}
)
class TestAnnotation {
    public static void main(String[] argv){
        System.out.println("I do nothing");
    }
}
