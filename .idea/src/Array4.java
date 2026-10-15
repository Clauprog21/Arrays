public class Array4 {
    public static void main(String[] args) {
        int[] num={0,1,2,3,4,5,6,7,8,9};
        int[] num2={0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num2.length ; j++) {
                if (num[i]==num2[j]){
                    System.out.println(num[i] + " ");
                }

            }
        }
    }
}
