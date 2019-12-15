// https://www.javabrahman.com/corejava/the-complete-java-enums-tutorial-with-examples/

// Nested enum types are implicitly static, and hence mentioning
// static in their definition is actually redundant.
class Employee {
    enum Department {
        HR, OPERATIONS, LEGAL, MARKETING;
    }
    private String name;
    private Integer age;
}


class EnumTest {
    public static void main(String[] args) {
        // Creating a enum type when it is nested inside a class
        Employee.Department enumVar = Employee.Department.HR;
        // .values() method of an enum type to use a forEach loop
        for (Employee.Department dept : Employee.Department.values()) {
            System.out.println("Enum constant -> "
                + dept
                + " with ordinal value-> "
                + dept.ordinal()
                );
        }
    }
}
