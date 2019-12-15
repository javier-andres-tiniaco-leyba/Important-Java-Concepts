//We can copy an array to another by the arraycopy method of System class.

class TestArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'h','e','l','l','o'};
        char[] copyTo = new char[5];

        System.arraycopy(copyFrom, 0, copyTo, 0, 5);
        System.out.println(new String(copyTo));
    }
}
