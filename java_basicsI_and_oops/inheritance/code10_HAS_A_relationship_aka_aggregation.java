class Operation {
    int square(int n) {
        return n * n;
    }
}

class Circle {
    Operation op; //aggregation (HAS-A relation)
    final double pi = Math.E;

    double area(int radius) {
        op = new Operation();
        //code reusability (i.e. delegates the method call).
        int rsquare = op.square(radius);
        return pi * rsquare;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}
