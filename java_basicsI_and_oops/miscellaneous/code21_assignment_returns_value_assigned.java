class Test {
	public static void main(String[] args) {
	    int i = 4;
        if((i = 10) == 10)
            System.out.format("OK%n");
        System.out.format("%d%n",i);
		
        for(int j = 0; (i = j) == 0; j++)
            System.out.format("OK2%n");
        System.out.format("%d%n",i);
	}
}
