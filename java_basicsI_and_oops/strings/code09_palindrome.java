class StringDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] charArray = new char[len];

        // reverse array of chars
        for (int i = len - 1; i>=0; i--) {
            charArray[i] = palindrome.charAt(i);
        }

        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }
}
