// https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html

class Word implements CharSequence {

    private String word;

    Word(String word) {
        this.word = word;
    }

    public char charAt(int index) {
        return this.word.charAt(index);
    }

    public int length() {
        return this.word.length();
    }

    public CharSequence subSequence(int start, int end) {
        return this.word.subSequence(start,end);
    }

    public String toString() {
        return this.word;
    }
}

class TestWord {
    public static void main(String[] args) {
        Word w = new Word("Hello");
        System.out.println(w.length());
        System.out.println(w.charAt(2));
        System.out.println(w.subSequence(1,3));
        System.out.println(w.toString());
    }
}
