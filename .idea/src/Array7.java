import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        String[] días = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Dominguo"};
        int[] temp = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < temp.length; i++) {
            do {
                temp[i] = sc.nextInt();

            } while (temp[i] < -30 || temp[i] > 50);

        }

    }
}