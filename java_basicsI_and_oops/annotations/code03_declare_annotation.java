@interface EnhancementRequest {
    int id();
    String synopsis();
    String engineer() default "unassigned";
    String date() default "unkown";
}
