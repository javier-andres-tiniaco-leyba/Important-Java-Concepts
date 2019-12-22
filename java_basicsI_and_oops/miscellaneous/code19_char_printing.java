class Test {
    public static void main(String[] args) {
        for (int i=0x0000;i<=0x00FF;i++) { //UTF-16 representation
            System.out.printf("0x%x : %c\n",i,(char)i);
        }
    }
}
