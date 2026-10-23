import java.util.Scanner;
public class Array7 {
    public static void main(String[] args) {
        String[] días = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        double[] temp = new double[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Introduce la temperatuda del " + días[i]);
            do {
                temp[i] = sc.nextDouble();
            } while (temp[i] < -30 || temp[i] > 50);
        }
        // Ahora tenemos el arry temp con las
        // temperauras de cada día.

        double sumaTemperatura = 0;
        System.out.println("media");
        for (int i = 0; i < temp.length; i++) {
            // A sumaTemperatura has de sumarle
            // el valor de la temperatura de ese día
            sumaTemperatura+=temp[i];
        }
        System.out.println("media sem "+sumaTemperatura/7+" ");



        double max= temp[0];
        int diamax;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]>max) {
                max = temp[i];
                diamax = i;
        double min= temp[0];
        int diamin;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i]>min) {
                min = temp[i];
                diamin = i;
            }
        }
        System.out.println("max: "+max+"ºC(" +días[diamax]+")");
        System.out.println("min: "+min+"ºC(" +días[diamin]+")");

        String diaspe=" ";
            for (int i = 0; i < temp.length; i++) {
                if (temp[i]>media) {
                    diaspe+=días[i]+" ";
                }
            }
            System.out.println("diaspe: "+diaspe);
            }

        double ms =0;
        double sub;
        int pos=0;
            for (int i= 0; i <temp.length ; i++) {
                ms=sub;
                pos=días[i];


            }


    }
}
