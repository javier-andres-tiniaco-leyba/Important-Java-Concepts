class LabeledForExample {
    public static void main(String[] args) {
        aa:
            for (int i=1; i<=3; i++){
                bb: // Labeling inner loop here is actually useless *
                    for (int j=1; j<=3; j++){
                        if (i==2 && j==2){
                            break aa;
                        }
                        System.out.println(i+" "+j);
                    }
            }
    }
}

// * it is done only to showcase that it is actually possible
