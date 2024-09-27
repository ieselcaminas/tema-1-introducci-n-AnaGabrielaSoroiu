import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        int num;
        int contar = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        num = sc.nextInt();

        for (int i = 0; i <= 10; i += 2) {
            if (contar % 2 == 0) {
                contar = num + i;
                System.out.println(contar);
            }
        }

    }
}
