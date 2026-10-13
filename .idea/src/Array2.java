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
    }

