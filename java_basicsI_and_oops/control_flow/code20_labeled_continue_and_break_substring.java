class ContinueWithLabelDemo {
    public static void main(String[] args) {

        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int sublen = substring.length();
        int max = searchMe.length() - sublen;

        test:
            for (int i = 0, n = sublen, k = 0, j = i; // *
                 i <= max;
                 i++, k = 0, n = sublen) {

                while (n-- != 0) {
                    if (searchMe.charAt(j++) != substring.charAt(k++)) {
                        continue test;
                    }
                }

                foundIt = true;
                    break test;
            }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}

// this loop could be transformed to a while loop where
// the first statement would declare variables before entering loop,
// the second would be the logical test and the third statement
// would happen at the end of the loop's body
