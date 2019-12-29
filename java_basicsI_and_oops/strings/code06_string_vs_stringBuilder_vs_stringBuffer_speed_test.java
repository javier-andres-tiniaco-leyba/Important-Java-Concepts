class ConcatTest {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();

        String str = new String("Java");
        for (int i=0; i<10000; i++){
            // Actually, it is creating new Strings because Strings are immutable
            str += "Tpoint";
        }
        System.out.println("Time taken by String: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10000; i++){
            sb.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i=0; i<10000; i++){
            sb2.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
