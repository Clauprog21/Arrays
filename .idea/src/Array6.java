public class Array6 {
    public static void main(String[] args) {
        int[] num={0,1,2,3,4,5,6,7,8,9};
        int pa = 5;
        for (int i=pa;i<num.length-1;i++) {
            num[i] = num[i + 1];
        }
        num[num.length-1] = 0;

    }
 }

