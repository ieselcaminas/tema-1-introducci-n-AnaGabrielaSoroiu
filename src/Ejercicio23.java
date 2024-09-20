import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        int num;
        int positivos = 0;

        Scanner sc = new Scanner(System.in);

        do {
            num = sc.nextInt();
            if(num > 0) {
                positivos++;
            }
        }while (num != 0);

        System.out.println("Tienes " + positivos + " positivos");
    }
}
