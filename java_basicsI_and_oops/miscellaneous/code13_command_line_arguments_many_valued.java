class Test {
    public static void main(String[] args) {
        int noArgs = args.length;
        System.out.println("Numbers of arguments passed:" + noArgs);
        for(int i=0; i<noArgs; i++)
            System.out.println(String.format("Argument %s: %s",i,args[i]));

        boolean flag = args instanceof String[];
        System.out.println("Is args an String[]?:"+flag);
    }
}
