// https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
// !! "this" keyword can not be used within a class method (static method)
// because there is not object to refer to

// If "this" keyword is present in a constructor, it must be the first line.

class Rectangle {
    private int x, y;
    private int width, height;

    public Rectangle() {
        this(0,0,1,1);
    }

    public Rectangle(int width, int height){
        this(0,0,width,height);
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
