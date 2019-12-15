// https://docs.oracle.com/javase/tutorial/java/annotations/repeating.html

import java.lang.annotation.Repeatable;

@Repeatable(Schedules.class)
@interface Schedule {
    String dayOfMonth() default "first";
    String datOfWeek() default "Mon";
    int hour() default 12;
}

@interface Schedules {
    Schedule[] value();
}
