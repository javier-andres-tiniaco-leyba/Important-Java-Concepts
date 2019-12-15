// https://www.javabrahman.com/corejava/the-complete-java-enums-tutorial-with-examples/

enum Department {

    HR("DEPT-01") {
        @Override
        public String getDeptCode() {
          return "NOT ACCESSIBLE";
        }
    },
    OPERATIONS("DEPT-02"),
    LEGAL("DEPT-03"),
    MARKETING("DEPT-04");//semi-colon is no longer optional here

    private String deptCode;

    Department(String deptCode) {
        this.deptCode=deptCode;
    }

    public String getDeptCode() {
        return deptCode;
    }
}

class EnumTest {

    public static void printEnum(Department dept) {
        System.out.println("Department name: "
          + dept
          + " Department Code: "
          + dept.getDeptCode()
          + " , Ordinal value: "
          + dept.ordinal()
          );

    }

    public static void main(String[] args) {

        for (Department dept : Department.values()) {
              switch (dept) {
                case HR:
                  System.out.println("Case - HR");
                  break;
                case OPERATIONS:
                  System.out.println("Case - OPERATIONS");
                  break;
                case MARKETING:
                  System.out.println("Case - MARKETING");
                  break;
                case LEGAL:
                  System.out.println("Case - LEGAL");
                  break;
              }
              printEnum(dept);
        }
    }

}
