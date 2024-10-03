import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        int num;
        int contar = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        num = sc.nextInt();

        for (int i = 0; i <= 8; i += 2) {
            if (num % 2 == 0) {
                contar = num + i + 2;
                System.out.println(contar);
            } else {
                contar = (num + 1) + i;
                System.out.println(contar);
            }
        }

    }
}
