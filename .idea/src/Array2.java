public class Array2 {
    public static void main(String[] args) {
        int[] num= new int[10];
        int p=0;
        int n=0;
        for (int i = 0; i < num.length; i++){
            if (num[i]>=0) {
                p += num[i];
            } else if (num[i]<0) {
                n+=num[i];

            }
            }
        }
        System.out.println("Suma de los positivos: " + p);
        System.out.println("Suma de los negativos: " + n);
    }
}
