import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        int num;
        int positivos = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            if (num > 0) {
                positivos++;
            }
        }
        System.out.println("Positivos: " + positivos);
    }
}
