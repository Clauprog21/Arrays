public class Array5 {
    public static void main(String[] args) {
        int[] num={2,4,6,8,10};
        int suma =10;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length ; j++) {
                if (num[i]+num[j]==suma){
                    System.out.println("la suma es 10");

                }
                
            }
        }
    }
}
