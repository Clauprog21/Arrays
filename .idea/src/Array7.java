import java.util.Scanner;
public class Array7 {
    public static void main(String[] args) {
        String[] días = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        double[] temp = new double[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Introduce la temperatuda del " + dias[i]);
            do {
                temp[i] = sc.nextDouble();
            } while (temp[i] < -30 || temp[i] > 50);
        }
        // Ahora tenemos el arry temp con las
        // temperauras de cada día.
        double media;
        double sumaTemperatura = 0;
        System.out.println("media");
        for (int j = 0; j < temp.length; j++) {
            // A sumaTemperatura has de sumarle
            // el valor de la temperatura de ese día
            sumaTemperatura+=temp[j];
        }

        media=sumaTemperatura/7;

    }
}